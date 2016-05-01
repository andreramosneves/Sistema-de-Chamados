/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import controle.ControleChamados;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author home
 */
public class TesteRelatorio {
    
    
   @Test
   public void testRelatorio(){
       ControleChamados controleChamados = new ControleChamados();

        TestCase.assertNotNull(controleChamados.emitirRelatorios(1));
       
   }
    
}
