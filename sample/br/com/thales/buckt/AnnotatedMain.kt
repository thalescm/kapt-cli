package br.com.thales.buckt

@ViewBinder
class NameViewBinder

// @ViewModel
// class NameViewModel

fun main(args: Array<String>) {
    val binder = NameViewBinder_()
    binder.bindViews()

    val otherBinder = AnnotatedMainJava()
    otherBinder.bindViewsToo()

    // val model = NameViewModel_()
}

fun out(num1: Int): Float {
    return num1 / .66f
}
