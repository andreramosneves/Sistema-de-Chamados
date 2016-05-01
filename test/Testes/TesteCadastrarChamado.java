/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Persistencia.ChamadoDAO;
import controle.ControleChamados;
import entidade.Chamado;
import org.junit.Test;

/**
 *
 * @author home
 */
public class TesteCadastrarChamado {
    
    @Test
    public void TestCriarChamado(){
        ChamadoDAO chamDAO = new ChamadoDAO();
        ControleChamados ctrChamados = new ControleChamados();
        
       String titulo = " teste de banco";
       String descricao = " banco de dados nao funciona";
       String so = "linux";
       String versao = " debian";
        
        Chamado chambanco=ctrChamados.InserirChamadoBancoDeDados(titulo, descricao, 0, tecnico, cliente, so, versaoSO, bancoDeDados);
        Chamado chamDes = ctrChamados.InserirChamadoDesempenho(titulo, descricao, 0, tecnico, cliente, so, versaoSO, operacao, 0);
        Chamado chamRede = ctrChamados.InserirChamadoRede(titulo, descricao, 0, tecnico, cliente, so, versaoSO, conexao, enderecoRede);
        
        ctrChamados.inserirRegistroChamado("Teste de Banco", chambanco, tec);
        ctrChamados.inserirRegistroChamado("Teste de Desempenho", chamDes, tec);
        ctrChamados.inserirRegistroChamado(" Teste de Rede", chamRede, tec);
        
        
        
        
        
        
        
    }
    
}
