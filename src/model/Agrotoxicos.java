/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Caue Felp
 */
public class Agrotoxicos extends InformacoesFiscais{
    
    private String agrotoxicos;
    private int cdProdutora;
    
    public void setAgrotoxicos(String agrotoxicos){
        this.agrotoxicos = agrotoxicos;
    }
    
    public String getAgrotoxicos(){
        return agrotoxicos;
    }
    
    public int getCdProdutora() {
        return cdProdutora;
    }

    public void setCdProdutora(int cdProdutora) {
        this.cdProdutora = cdProdutora;
    }
    

    public Agrotoxicos(String agrotoxicos, String incentivosFiscais, String impostosMunicipais, String impostosEstaduais, String impostosFederais, String taxasFederais, int codigo, String NumEmpregados, String QtMaquinas, String Nivel, String nome, String endereco, String produtos, String destino, String producao) {
        super(incentivosFiscais, impostosMunicipais, impostosEstaduais, impostosFederais, taxasFederais, codigo, NumEmpregados, QtMaquinas, Nivel, nome, endereco, produtos, destino, producao);
        setAgrotoxicos(agrotoxicos);
    }

    public Agrotoxicos(String agrotoxicos) {
        setAgrotoxicos(agrotoxicos);
    }
    
    public Agrotoxicos(int cdProdutora,String agrotoxicos) {
        setCdProdutora(cdProdutora);
        setAgrotoxicos(agrotoxicos);
    }
    
    public Agrotoxicos(){}

    @Override
    public String toString() {
        return "Agrotóxicos:" + "\n" +
                getAgrotoxicos();
    }

    
    
    
    
    

}
