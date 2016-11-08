// Generated code from Butter Knife. Do not modify!
package com.robot.tuling.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.robot.tuling.ui.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427447, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131427447, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131427440, "field 'lvMessage'");
    target.lvMessage = finder.castView(view, 2131427440, "field 'lvMessage'");
    view = finder.findRequiredView(source, 2131427443, "field 'ivSendMsg'");
    target.ivSendMsg = finder.castView(view, 2131427443, "field 'ivSendMsg'");
    view = finder.findRequiredView(source, 2131427445, "field 'etMsg'");
    target.etMsg = finder.castView(view, 2131427445, "field 'etMsg'");
    view = finder.findRequiredView(source, 2131427442, "field 'rlMsg'");
    target.rlMsg = finder.castView(view, 2131427442, "field 'rlMsg'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.lvMessage = null;
    target.ivSendMsg = null;
    target.etMsg = null;
    target.rlMsg = null;
  }
}
