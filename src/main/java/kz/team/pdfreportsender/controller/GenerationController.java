package kz.team.pdfreportsender.controller;

import kz.team.pdfreportsender.service.HtmlToPdfService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/generate")
public class GenerationController extends  BaseController{

    private final HtmlToPdfService htmlToPdfService;

    public GenerationController(HtmlToPdfService htmlToPdfService) {
        this.htmlToPdfService = htmlToPdfService;
    }


    @GetMapping
    public ResponseEntity<?> getAll() throws Exception {
        return buildResponse(htmlToPdfService.generatePDFFromHTML3(), HttpStatus.OK);
    }

}
