package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-views")
public class RandomPhraseServlets extends HttpServlet {

    String[] funFacts = {
        "Goosebumps are meant to ward off predators",
        "The moon has moonquakes",
        "The heads on Easter Island have bodies",
        "Humans are the only animals that blush",
        "The wood frog can hold its pee for up to eight months"
    };

  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {

        final String json = convertToJson(funFacts);

        response.setContentType("application/json;");
        response.getWriter().println(json);
    }

  private String convertToJson(final String[] funFacts) {
    String json = "{";
    for(int i = 0; i < (funFacts.length - 1); i++)
    {
        json += "\"funFact" + String.valueOf(i + 1) + "\": ";
        json += "\"" + funFacts[i] + "\"";
        json += ", ";
    }
    json += "\"funFact" + String.valueOf(funFacts.length) + "\": ";
    json += "\"" + funFacts[funFacts.length - 1] + "\"";
    json += "}";

    return json;
  }

  /*private String convertToJsonUsingGson(String[] funFacts) {
    Gson gson = new Gson();
    String json = gson.toJson(funFacts);
    return json;
  }*/
}