package com.craftsman.designPattern;



import com.craftsman.designPattern.exercice.Context;
import com.craftsman.designPattern.exercice.impl.SaveDoc;
import com.craftsman.designPattern.exercice.impl.SaveDocx;
import com.craftsman.designPattern.exercice.impl.SavePDF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContextTest {



    @Test
    void TestSaveDoc() {
        Context context = new Context();
        context.setSaveStrategy(new SaveDoc());

        Assertions.assertEquals(context.save("DesignPatterns"), "DesignPatterns.doc");
    }

    @Test
    void TestSaveDocx() {
        Context context = new Context();
        context.setSaveStrategy(new SaveDocx());

        Assertions.assertEquals(context.save("DesignPatterns"), "DesignPatterns.docx");
    }

    @Test
    void TestSavePDF() {
        Context context = new Context();
        context.setSaveStrategy(new SavePDF());

        Assertions.assertEquals(context.save("DesignPatterns"), "DesignPatterns.pdf");
    }

}