package com.snhu.mscs.cs600.module5;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Books List")
@Route(value = "", layout = MainLayout.class)
public class BooksView extends VerticalLayout implements TestData {
    public BooksView() {
        setSizeFull();

        H2 heading = new H2("Books List");

        Grid<Book> grid = new Grid<>(Book.class, false);
        grid.addColumn(Book::getTitle).setHeader("Title");
        grid.addColumn(Book::getAuthor).setHeader("Author");
        grid.addColumn(Book::getYear).setHeader("Year Published");

        grid.setItems(book_list);
        grid.setSizeFull();

        add(heading, grid);
    }
}
