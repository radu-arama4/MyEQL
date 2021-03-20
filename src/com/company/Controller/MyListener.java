package com.company.Controller;

import com.company.EQL_ANTLR.Generated.EQLBaseListener;
import com.company.EQL_ANTLR.Generated.EQLParser;
import com.company.Data.Email;
import com.company.Data.Filter;
import com.company.Data.Subject;
import com.company.Data.To;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyListener extends EQLBaseListener {

    ArrayList<Email> emails = new ArrayList<>();

    Map<String, Filter> filters = new HashMap<>();


    @Override
    public void enterProgram(EQLParser.ProgramContext ctx) {
        emails.add(new Email("vasea", "dasda"));
        emails.add(new Email("jora", "dasda"));
    }

    @Override
    public void exitFilter(EQLParser.FilterContext ctx) {

        Filter filter = new Filter();
        try {
            ctx.destination();
            ArrayList<String> list = new ArrayList<>();
            list.add(ctx.destination().to().destinationvalue().EMAIL().getText());
            filter.setTo(new To(list));
        }
        catch (NullPointerException e){

        }
        try {
            ctx.subject();
            ArrayList<String> list = new ArrayList<>();
            list.add(ctx.subject().subjectvalue().wordlist().WORD().get(0).getText());
            filter.setSubject(new Subject(list));
        }
        catch (NullPointerException e){

        }



    }

    @Override
    public void exitAssignment(EQLParser.AssignmentContext ctx) {

        ArrayList<Email> filteredEmails = new ArrayList<>();

        //ctx.WORD() - ID
        //ctx.query().filter().get(0) - acces to first rule in the query/filter

        System.out.println(filters.get("filter").toString());
        System.out.println(filters.get("filter2").toString());


    }
}

