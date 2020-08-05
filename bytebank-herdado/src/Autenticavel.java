//Contrato Autenticavel
    //Quem assinar esse contrato, precisa implementar
        //Metodo SetSenha
        //Metodo Autentica

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
