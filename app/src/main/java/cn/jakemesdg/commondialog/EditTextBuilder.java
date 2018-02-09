package cn.jakemesdg.commondialog;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import cn.jake.share.frdialog.dialog.FRBaseDialogBuilder;

/**
 * Created by jack on 2018/2/9
 */

public class EditTextBuilder extends FRBaseDialogBuilder<EditTextBuilder> {

    public EditTextBuilder(Context context, int themeResId) {
        super(context, themeResId);
    }

    public EditTextBuilder addTextWatch(int id, TextWatcher textWatcher) {
        View view = getView(id);
        if (view instanceof EditText) {
            ((EditText) view).addTextChangedListener(textWatcher);
        }
        return this;
    }
}