package no.syver.morfi;

import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import no.syver.morfi.model.Form;
import no.syver.morfi.model.Page;
import no.syver.morfi.model.Question;
import no.syver.morfi.model.enums.QuestionType;
import no.syver.morfi.repository.FormRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MorfiApplication.class)
public class SpringBootJPAIntegrationTest {
  
    @Autowired
    private FormRepository formRepository;
 
    @Test
    public void testStoreFormWithFormPages() {
    	Form form = new Form();
    	form.setName("Et veldig flott navn");
    	
    	Page formPage = new Page();
    	formPage.setName("Im will hold the actual questions");
        
    	form.addPage(formPage);
        
    	Question formQuestion = new Question();
    	formQuestion.setName("Har du en sigarett?");
    	formQuestion.setQuestionType(QuestionType.INPUT);
    	
    	// Validate results
    	formRepository.save(form);
        
        Optional<Form> optionalFoundForm = formRepository.findById(form.getId());
        Form foundForm = optionalFoundForm.isPresent() ? optionalFoundForm.get() : null;
        
        assertNotNull(foundForm);
        assertNotNull(foundForm.getName(), foundForm.getName());
        assert(form.getPages().size() > 0);
    }
}