package br.com.thales.buckt

@ViewBinder
class NameViewBinder

fun main(args: Array<String>) {
    val binder = NameViewBinder_()
    binder.bindViews()

    val otherBinder = AnnotatedMainJava()
    otherBinder.bindViewsToo()
}

fun out(num1: Int): Float {
    return num1 / .66f
}
