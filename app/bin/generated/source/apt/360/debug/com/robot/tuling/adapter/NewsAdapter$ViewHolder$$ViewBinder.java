// Generated code from Butter Knife. Do not modify!
package com.robot.tuling.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NewsAdapter$ViewHolder$$ViewBinder<T extends com.robot.tuling.adapter.NewsAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427465, "field 'ivNewsIcon'");
    target.ivNewsIcon = finder.castView(view, 2131427465, "field 'ivNewsIcon'");
    view = finder.findRequiredView(source, 2131427466, "field 'tvNewsTitle'");
    target.tvNewsTitle = finder.castView(view, 2131427466, "field 'tvNewsTitle'");
    view = finder.findRequiredView(source, 2131427467, "field 'tvNewsContent'");
    target.tvNewsContent = finder.castView(view, 2131427467, "field 'tvNewsContent'");
  }

  @Override public void unbind(T target) {
    target.ivNewsIcon = null;
    target.tvNewsTitle = null;
    target.tvNewsContent = null;
  }
}
