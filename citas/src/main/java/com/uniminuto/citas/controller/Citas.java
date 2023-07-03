package com.uniminuto.citas.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uniminuto.citas.clients.UserClientRest;
import com.uniminuto.citas.model.Cita;
import com.uniminuto.citas.model.InsertCita;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping()
@RequiredArgsConstructor
public class Citas {

    private final UserClientRest client;

    private static Logger log = LoggerFactory.getLogger(Citas.class);

    @RequestMapping(value = "/registrar-cita", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String registrarCita(@RequestParam("documentId") String documentId,
                                @RequestParam("typeQuote") String typeQuote,
                                @RequestParam("typeDocument") String typeDocument,
                                @RequestParam("nameClient") String nameClient,
                                @RequestParam("doctorName") String doctorName,
                                @RequestParam("dateQuote") String dateQuote,
                                @RequestParam("ageClient") int ageClient) throws JsonProcessingException {
        log.info("inicia proceso");
        ObjectMapper objectMapper = new ObjectMapper();
        InsertCita insertCita = new InsertCita();
        insertCita.setTypeProcess("insert");
        insertCita.setCode("_lS0b960RK4sScPJAxEjsDnh7s2xYD72Fpc1-ybVSE8cAzFuyiBmpQ==");
        insertCita.setAgeClient(ageClient);
        insertCita.setDateQuote(dateQuote);
        insertCita.setDoctorName(doctorName);
        insertCita.setDocumentId(documentId);
        insertCita.setTypeDocument(typeDocument);
        insertCita.setNameClient(nameClient);
        insertCita.setTypeQuote(typeQuote);
        log.info(objectMapper.writeValueAsString(insertCita));
        // Lógica para registrar la cita

        ResponseEntity<String> response = client.citas("_lS0b960RK4sScPJAxEjsDnh7s2xYD72Fpc1-ybVSE8cAzFuyiBmpQ==","insert", documentId, typeQuote, typeDocument, nameClient, doctorName, dateQuote, ageClient);

        log.info(response.getBody());

        return "redirect:/cita-registrada"; // Redirige a una página de confirmación
    }

    @GetMapping("/consultar-documento")
    public ResponseEntity<Cita> consultarDocumento(@RequestParam("documentId") String documentId) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
            ResponseEntity<String> citas = client.citas("_lS0b960RK4sScPJAxEjsDnh7s2xYD72Fpc1-ybVSE8cAzFuyiBmpQ==", "consult", documentId);
            Cita cita = objectMapper.readValue(citas.getBody(), Cita.class);
            return ResponseEntity.ok(cita);
    }


}
