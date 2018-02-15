package br.com.thales.buckt;

import br.com.thales.buckt.kotlin.ViewBinder;

@ViewBinder
public class AnnotatedMainJava {

    public void bindViewsToo() {
      AnnotatedMainJava_ binder = new AnnotatedMainJava_();
      binder.bindViews();

      System.out.println(AnnotatedMainKt.out(1));
    }
}
