package br.com.thales.buckt

@ViewBinder
class NameViewBinder

fun main(args: Array<String>) {
    val binder = NameViewBinder_()
    binder.bindViews()
}
