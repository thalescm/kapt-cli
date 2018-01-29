package br.com.thales.buckt;

@ViewBinder
public class AnnotatedMainJava {

    public void bindViewsToo() {
      AnnotatedMainJava_ binder = new AnnotatedMainJava_();
      binder.bindViews();

      System.out.println(AnnotatedMainKt.out(1));
    }
}
