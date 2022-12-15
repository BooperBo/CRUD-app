# Проект: Цифровой учёт книг 
____

# Оглавление
1. [О проекте](#Проект-Цифровой-учёт-книг-представляет-собой-информационную-систему-библиотеки-основные-функци- которой-CRUD-операции)
2. [Стек проекта](#Стек-проекта)
3. [Список задач](#Список-задач-которые-необходимо-было-решить)
4. [Запуск приложения](#Запуск-приложения)

____

### Проект «Цифровой учёт книг» представляет собой информационную систему библиотеки, основные функции которой CRUD операции:
- регистрация читателей;
- выдача книг читателям;
- а также их возвращение в библиотеку.

Проект показывает базовые навыки программирования java-core и Spring framework.

[:arrow_up:Оглавление](#Оглавление)
____
### Стек проекта
- java 11;
- maven;
- spring framework;
- hibernate;
- postgreSQL;
- thymeleaf.

[:arrow_up:Оглавление](#Оглавление)
____
### Список задач, которые необходимо было решить:

Основные функции:

1. [:heavy_check_mark:] Регистрация читателей;

2. [:heavy_check_mark:] Выдача книг (кому);

3. [:heavy_check_mark:] Возврат книг;

____

Необходимые функции:

4. [:heavy_check_mark:] страницы добавления, изменения и удаления человека;

5. [:heavy_check_mark:] страницы изменения и удаления книги;

6. [:heavy_check_mark:] страница со списком всех людей (кликабельные ссылки -> переход на страницу человека);

7. [:heavy_check_mark:] страница со списком городов (кликабельные ссылки -> переход на страницу списков городов);

8. [:heavy_check_mark:] страница со списком библиотек города (кликабельные ссылки -> переход на страницу со списком всех книг);

9. [:heavy_check_mark:] страница со списком всех книг (кликабельные ссылки -> переход на страницу книги);

10. [:heavy_check_mark:] страница человека, на которой показаны значения его полей и список книг, которые он взял. Если человек не взял ни одной книги, вместо списка должен быть текст (человек пока не взял ни одной книги);

11. [:heavy_check_mark:] страница книги, на которой показаны значения полей этой книги и имя человека, который взял эту книгу. Если эта книга не была ни кем взята, то должен быть текст (эта книга свободна);

12. [:heavy_check_mark:] на странице книги, если книга взята человеком, рядом с его именем должна быть кнопка "Освободить книгу", эта кнопка нажимается библиотекарем тогда, когда читатель возвращает эту книгу обратно в библиотеку. После нажатия на эту кнопку книга снова становится свободна и пропадает из списка книг человека;

13. [:heavy_check_mark:] на странице книги, если книга свободна должен быть выпадающий список со всеми людьми и кнопка "Назначить книгу". Эта кнопка нажимается библиотекарем, когда читатель хочет забрать эту книгу домой. После нажатия на эту кнопку, книга должна начать принадлежать выбранному человеку и должна появится в его списке книг;

14. [:heavy_check_mark:] валидация полей;

15. [:heavy_check_mark:] пагинация для книг;

16. [:heavy_check_mark:] добавить сортировку книг по году;

17. [:heavy_check_mark:] создать страницу поиска книг;

18. [:heavy_check_mark:] добавить автоматическую проверку на то, что человек просрочил книгу; 

19. [:heavy_check_mark:] реализовать страницу регистрации пользователей, аутентификацию и авторизацию на основе ролей; 

20. [:heavy_check_mark:] добавить csrf и шифрование паролей пользователей в БД;

21. [:x:] реализовать функционал администратора и пользователя; 

22. [:heavy_check_mark:] продумать и добавить навигацию по страницам;

23. [:heavy_check_mark:] сделать страницу пользователя. Вывести данные аутентифицированного пользователя, добавить всю навигацию на страницу.

____

-  Сущности: человек (OneToMany), книга (ManyToOne), библиотека (OneToMany, ManyToOne), город (OneToMany). 

### Запуск приложения
1. Необходимо заполнить бд
   -  найдите в корне проекта папку sql с файлом _library_db_;
   -  выполните sql команды для создания таблиц по очередно:
   -  City, Library, Person, Book.
2. Можно запускать

