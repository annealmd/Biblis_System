package com.anne.biblis.entity;

import com.anne.biblis.entity.Livro;
import com.anne.biblis.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-16T21:09:58")
@StaticMetamodel(Emprestimo.class)
public class Emprestimo_ { 

    public static volatile SingularAttribute<Emprestimo, Date> dataEmprestimo;
    public static volatile ListAttribute<Emprestimo, Livro> livros;
    public static volatile SingularAttribute<Emprestimo, Usuario> usuario;
    public static volatile SingularAttribute<Emprestimo, Long> id;
    public static volatile SingularAttribute<Emprestimo, Date> dataDevolucao;

}