package com.uniminuto.citas.clients;


import com.uniminuto.citas.configuration.FeignClientConfig;
import com.uniminuto.citas.model.Cita;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URI;
import java.util.List;


@FeignClient(name="msvc-pool-apis",url="${url-api-services}",configuration= FeignClientConfig.class)
public interface UserClientRest {

    @RequestMapping(method = RequestMethod.GET, path = "/api/function-clients-UniminutoProject"
            ,produces = {"application/json"})
    ResponseEntity<String>  citas(@RequestParam("code") String code,
                                  @RequestParam("typeProcess") String typeProcess,
                                  @RequestParam("documentId") String documentId,
                                  @RequestParam("typeQuote") String typeQuote,
                                  @RequestParam("typeDocument") String typeDocument,
                                  @RequestParam("nameClient") String nameClient,
                                  @RequestParam("doctorName") String doctorName,
                                  @RequestParam("dateQuote") String dateQuote,
                                  @RequestParam("ageClient") int ageClient);

    @RequestMapping(method = RequestMethod.GET, path = "/api/function-clients-UniminutoProject"
            ,produces = {"application/json"})
    ResponseEntity<String> citas(@RequestParam("code") String code,
                     @RequestParam("typeProcess") String typeProcess,
                     @RequestParam("documentId") String documentId);

}
