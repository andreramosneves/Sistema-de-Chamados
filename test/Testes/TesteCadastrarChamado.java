/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Persistencia.ChamadoDAO;
import Persistencia.ClienteDAO;
import Persistencia.TecnicoDAO;
import controle.ControleChamados;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Tecnico;
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
       String versaoSO = " debian";
       String bancoDeDados = " mysql";
       
        TecnicoDAO tDAO = new TecnicoDAO();
        Tecnico tecnico = tDAO.get(1);
        ClienteDAO cDAO = new ClienteDAO();
        ClienteEmpresa cliente = cDAO.get((long)1);
      
        Chamado chambanco=ctrChamados.InserirChamadoBancoDeDados(titulo, descricao, 0, tecnico, cliente, so, versaoSO, bancoDeDados);
        
         String tituloDes = " teste de banco";
       String descricaoDes = " banco de dados nao funciona";
       String soDes = "linux";
       String versaoSODes = " debian";
       String operacao = " test";
              
        
        Chamado chamDes = ctrChamados.InserirChamadoDesempenho(tituloDes, descricaoDes, 0, tecnico, cliente, soDes, versaoSODes, operacao, 0);
        
        String tituloRede = " teste de banco";
       String descricaoRede = " banco de dados nao funciona";
       String soRede= "linux";
       String versaoSORede = " debian";
          String conexaoRede =" test";
       String enderecoRedeRede = "rua maria antonia";
        
        Chamado chamRede = ctrChamados.InserirChamadoRede(tituloRede, descricaoRede, 0, tecnico, cliente, soRede, versaoSORede, conexaoRede, enderecoRedeRede);
        
   
        
        ctrChamados.inserirRegistroChamado("Teste de Banco", chambanco, tecnico);
        ctrChamados.inserirRegistroChamado("Teste de Desempenho", chamDes, tecnico);
        ctrChamados.inserirRegistroChamado(" Teste de Rede", chamRede, tecnico);
        
    }
 }
