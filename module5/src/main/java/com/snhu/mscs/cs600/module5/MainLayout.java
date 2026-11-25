package com.snhu.mscs.cs600.module5;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;

/**
 * Main layout is Application shell with header (logo, app name, author)
 * plus side navigation panel
 * 
 * Created by Tim Barrett
 */

public class MainLayout extends AppLayout{
    public MainLayout() {
        addHeader();
        addSideNav();
    }

    private void addHeader() {
        DrawerToggle toggle = new DrawerToggle();

        Image logo = new Image("images/logo.png", "Module5 logo");
        logo.setHeight("32px");

        H1 appName = new H1("Module5");
        appName.getStyle().set("font-size", "var(--lumo-font-size-1)").set("margin", "0");

        Span author = new Span("Tim Barrett");
        author.getStyle().set("margin-right", "var(--lumo-space-m)");

        HorizontalLayout header = new HorizontalLayout(toggle, logo, appName, author);
        header.setWidthFull();
        header.setDefaultVerticalComponentAlignment(Alignment.CENTER);
        header.expand(appName);

        addToNavbar(header);
    }

    private void addSideNav() {
        SideNav nav = new SideNav();
        nav.addItem(new SideNavItem("Books List", BooksView.class, VaadinIcon.BOOK.create()));
        addToDrawer(nav);
    }
}
