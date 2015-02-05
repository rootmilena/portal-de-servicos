package br.gov.servicos.frontend;

import br.gov.servicos.servicos.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

import static org.elasticsearch.index.query.QueryBuilders.queryString;

@Controller
class BuscaController {

    ServicoRepository sr;

    @Autowired
    public BuscaController(ServicoRepository sr) {
        this.sr = sr;
    }

    @RequestMapping("/busca")
    ModelAndView busca(@RequestParam(required = true) String q) {
        HashMap<String, Object> model = new HashMap<>();
        model.put("termo", q);
        model.put("resultados", sr.search(queryString(q)));
        return new ModelAndView("resultados-busca", model);
    }

}
