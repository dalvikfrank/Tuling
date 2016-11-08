// Generated code from Butter Knife. Do not modify!
package com.robot.tuling.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AboutActivity$$ViewBinder<T extends com.robot.tuling.ui.AboutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427447, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131427447, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131427436, "field 'gvAbout'");
    target.gvAbout = finder.castView(view, 2131427436, "field 'gvAbout'");
    view = finder.findRequiredView(source, 2131427437, "field 'lrTitle'");
    target.lrTitle = finder.castView(view, 2131427437, "field 'lrTitle'");
    view = finder.findRequiredView(source, 2131427438, "field 'tvVersionRight'");
    target.tvVersionRight = finder.castView(view, 2131427438, "field 'tvVersionRight'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.gvAbout = null;
    target.lrTitle = null;
    target.tvVersionRight = null;
  }
}
