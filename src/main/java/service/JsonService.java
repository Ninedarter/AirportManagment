package service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Flight;
import entity.Person;
import entity.Pilot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonService {

    public List<Flight> getDataFromJsonToList() throws IOException {
        String file = "src/main/resources/flights.json";
        String json = new String(Files.readAllBytes(Paths.get(file)));

        ObjectMapper mapper = new ObjectMapper();

        List<Flight> flights = mapper.readValue(json, new TypeReference<>() {});
        return flights;
    }



        public List<Flight> convertJsonToList(String filePath) throws IOException {
            //1.nuskaitom json faila ir patalpinam i eilute
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
            //System.out.println(jsonString);
            //2. konvertuojam nus
            List<Flight> flights = new ObjectMapper().readValue(jsonString, new TypeReference<>() {
            });
            //3. graziname turima sarasa.
            return flights;
        }



        public  void anotherJson() throws IOException {
        try {  byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/flights.json"));
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/flights.json")));
            List<Flight> pilots = objectMapper.readValue(jsonString, new TypeReference<>(){});

          //  JsonNode pilotsNode = root.get("aircraft").get("pilots");
           // List<Flight> pilots = objectMapper.readValue(root.toString(), new TypeReference<List<Flight>>(){});

       } catch (IOException e) {
                e.printStackTrace();
            }
//            JsonNode pilotsNode = root.get("aircraft").get("pilots");
//            for(int i = 0; i < pilotsNode.size(); i++){
//                JsonNode pilotNode = pilotsNode.get(i);
//                String firstName = pilotNode.get("firstName").asText();
//                String lastName = pilotNode.get("lastName").asText();
//                System.out.println("Pilot " + (i+1) + ": " + firstName + " " + lastName);
//            }
        }
    }

