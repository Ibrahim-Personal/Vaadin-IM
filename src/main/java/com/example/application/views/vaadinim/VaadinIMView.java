package com.example.application.views.vaadinim;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "IM", layout = MainView.class)
@PageTitle("Vaadin-IM")
@CssImport("./styles/views/vaadinim/vaadin-im-view.css")
@RouteAlias(value = "", layout = MainView.class)
public class VaadinIMView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public VaadinIMView() {
        setId("vaadin-im-view");
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        add(name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
    }

}
