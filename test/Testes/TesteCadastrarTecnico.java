/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import controle.ControleTecnicos;
import entidade.Tecnico;
import java.util.Random;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author home
 */
public class TesteCadastrarTecnico {
    
        @Test
    public void testCadastrarMesmoTecnico() {
        Random rand = new Random();
        ControleTecnicos c = new ControleTecnicos();
        Tecnico tec = c.inserir(1, "Andre R");
        TestCase.assertNull(tec);
    }   
    
    @Test
    public void testTelefoneNegativo() {
        Random rand = new Random();
        ControleTecnicos c = new ControleTecnicos();
        Tecnico tec = c.inserir(-11, "Tel Negativo");
        TestCase.assertNull(tec);
    }


    
}
