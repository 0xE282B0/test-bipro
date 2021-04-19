package eu.fincon.biproadapter.provider.norm426.customertemplate.application;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import eu.fincon.biproadapter.provider.common.genericstandardadapter.profile.Environment;
import eu.fincon.biproadapter.provider.norm426.product.standardadapter.Norm426Application;

@SpringBootTest(classes = {TemplateApplication.class, Norm426Application.class})
@ActiveProfiles(Environment.TEST)
@DisplayName("Template Application tests")
class TemplateApplicationTest {

    @Test
    @DisplayName("Test - loads context")
    void contextLoads() {

    }
}