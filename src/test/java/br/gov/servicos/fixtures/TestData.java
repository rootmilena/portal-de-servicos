package br.gov.servicos.fixtures;

import br.gov.servicos.cms.Conteudo;
import br.gov.servicos.metricas.Feedback;
import br.gov.servicos.servico.AreaDeInteresse;
import br.gov.servicos.servico.Orgao;
import br.gov.servicos.servico.Servico;
import br.gov.servicos.servico.linhaDaVida.LinhaDaVida;
import br.gov.servicos.servico.publicoAlvo.PublicoAlvo;

import static java.util.Collections.singletonList;

public class TestData {

    public static final Servico SERVICO = new Servico()
            .withId("1")
            .withTitulo("Título")
            .withDescricao("Descrição")
            .withUrl("url://site")
            .withUrlAgendamento("url://agendamento")
            .withTaxa("Gratuita")
            .withPrestador(new Orgao().withId("1").withNome("Nome").withTelefone("123"))
            .withResponsavel(new Orgao().withId("2").withNome("Nome").withTelefone(null))
            .withPublicosAlvo(singletonList(new PublicoAlvo().withId("servicos-aos-cidadaos").withTitulo("Serviços aos Cidadãos")))
            .withAreasDeInteresse(singletonList(new AreaDeInteresse().withId("3").withTitulo("Área de Interesse")))
            .withLinhasDaVida(singletonList(new LinhaDaVida().withId("4").withTitulo("Linha da Vida")))
            .withEventosDasLinhasDaVida(singletonList("Eventos das Linhas da Vida"));

    public static final Conteudo CONTEUDO = new Conteudo()
            .withTitulo("Título")
            .withHtml("<h1>Título</h1>\n\nConteúdo");

    public static final Feedback FEEDBACK = new Feedback()
            .withUrl("/servico/foo")
            .withQueryString("bar=baz")
            .withTimestamp(123L)
            .withConteudoEncontrado(true)
            .withFeedback("Otimo site");
}