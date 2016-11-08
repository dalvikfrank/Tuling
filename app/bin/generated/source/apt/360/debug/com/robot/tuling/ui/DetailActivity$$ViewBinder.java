// Generated code from Butter Knife. Do not modify!
package com.robot.tuling.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DetailActivity$$ViewBinder<T extends com.robot.tuling.ui.DetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427447, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131427447, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131427439, "field 'webView'");
    target.webView = finder.castView(view, 2131427439, "field 'webView'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.webView = null;
  }
}
