package ru.yandex.practicum.contacts.presentation.base;
/*
Интерфейс заставляет класс, описывающие элемента списка, реализовывать методы для вычисления
значения метода areItemsTheSame().
Ограничитель дженерик класса ListDiffCallback
 */
public interface ListDiffCallBack <T> {


/*
Принимает объект имплементирующего интерфейс класса.
 */
    boolean theSameAs(T t);

    boolean equals(Object o);

}
