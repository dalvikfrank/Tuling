// Generated code from Butter Knife. Do not modify!
package com.robot.tuling.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NewsActivity$$ViewBinder<T extends com.robot.tuling.ui.NewsActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427447, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131427447, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131427446, "field 'xlvListView'");
    target.xlvListView = finder.castView(view, 2131427446, "field 'xlvListView'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.xlvListView = null;
  }
}
