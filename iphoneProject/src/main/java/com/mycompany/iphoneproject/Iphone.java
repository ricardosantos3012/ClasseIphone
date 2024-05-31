/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iphoneproject;

/**
 *
 * @author noteb
 */
public class Iphone{

   public void abrirReprodutorMusical() {
       ReprodutorMucical novoReprodutor = new ReprodutorMucical();
       
       novoReprodutor.tocar("Brasilia amarela");
       
       novoReprodutor.pausar();
       
       novoReprodutor.selecionarMusica("Primeiros erros");
       
   }
   
   public void abrirTelefone() {
       AparelhoTelefonico novoTelefone = new AparelhoTelefonico();
       
       System.out.println("Ligando para " + novoTelefone.ligar("(47)99785-8974"));
       
       novoTelefone.atender();
       
       novoTelefone.iniciarCorreioVoz();
   }
   
   public void abrirNavegador() {
       NavegadorInternet abreNavegador = new NavegadorInternet();
       
       System.out.println("Site aberto " + abreNavegador.exibirPagina("https:\\www.google.com.br"));
       
       abreNavegador.atualizarPagina();
       
       abreNavegador.adicionaNovaAba();
   }
    
}
