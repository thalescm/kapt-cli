package br.com.thales.buckt.kotlin

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement

class VBProcessor : AbstractProcessor() {

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        return mutableSetOf(ViewBinder::class.java.name)
    }

    override fun getSupportedSourceVersion(): SourceVersion {
        return SourceVersion.latest()
    }

    override fun process(annotations: MutableSet<out TypeElement>, roundEnv: RoundEnvironment): Boolean {
        println("++++ I'm processing the file ++++++")
        roundEnv.getElementsAnnotatedWith(ViewBinder::class.java)
                .forEach {
                    val className = it.simpleName.toString()
                    val pkg = processingEnv.elementUtils.getPackageOf(it).toString()
                    generateClass(className, pkg)
                }
        return true
    }

    private fun generateClass(name: String, pkg: String) {
        val fileName = "${name}_"
        val file = FileSpec
                .builder(pkg, fileName)
                .addType(TypeSpec
                        .classBuilder(fileName)
                        .addFunction(FunSpec
                                .builder("bindViews")
                                .addStatement("println(\"Views were bound\")")
                                .build())
                        .build()
                ).build()
        val genDir = processingEnv.options["kapt.kotlin.generated"]
        file.writeTo(File(genDir))
    }
}
