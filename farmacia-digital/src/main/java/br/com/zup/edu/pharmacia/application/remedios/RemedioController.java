package br.com.zup.edu.pharmacia.application.remedios;

import br.com.zup.edu.pharmacia.domain.remedios.Remedio;
import br.com.zup.edu.pharmacia.domain.remedios.RemedioService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("v1/remedios")
public class RemedioController {

    private final RemedioService service;

    public RemedioController(RemedioService service) {
        this.service = service;
    }

    public URI salva(@RequestBody @Valid NovoRemedioRequest request, UriComponentsBuilder uriBuilder) {
        Remedio remedio = service.salva(request.toModel());
        return uriBuilder.path("v1/remedios/{id}").buildAndExpand(remedio.getId()).toUri();
    }
}
