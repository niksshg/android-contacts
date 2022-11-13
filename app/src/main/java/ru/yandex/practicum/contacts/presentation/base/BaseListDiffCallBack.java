package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import ru.yandex.practicum.contacts.presentation.main.ContactUi;
/*
Если честно не совсем понял. В задаче указано, что параметр типа ListDiffCallBack должен быть именем класса(BaseListDiffCallBack), но тогда не работает код.
 */
public class BaseListDiffCallBack <T extends ListDiffCallBack<T>> extends DiffUtil.ItemCallback<T>  {

    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }
}
