package org.jetbrains.demo9.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.IOException;
import java.io.StringWriter;

public class JSON {
  public static String generateJSON() throws IOException {
    final StringWriter text = new StringWriter();
    final JsonGenerator generator = new JsonFactory().createGenerator(text);
    generator.useDefaultPrettyPrinter();

    try (generator; text) {
      generator.writeStartObject();
      generator.writeStringField("JavaOne", "rocks!");
      generator.writeEndObject();
    }

    return text.toString();
  }
}
