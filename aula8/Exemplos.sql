/* Comentários */
# comentário
-- comentário
/*
create database newdb; #criação 
drop database if exists newdb; #deleção

desc tabela; #ver descrição da tabema 
select * from tabela; #consultar todos dados OU substituir * por coluna OU acrescentar condição
#Ctrl+B organiza a query (Edit > Format > Beautiful Query)


alter table tabela drop column nomecoluna; #alterar padrão da tabela 1/2
alter table tabela add column nometabela varchar(50);  #alterar padrão da tabela 2/2
delete from tabela where coluna = valor; #deletar registro
*/

SELECT 
    nomeFunc, email
FROM
    funcionario
WHERE
    nomeFunc LIKE 'claudia%';

SELECT 
    nomeFunc, nomeDepto
FROM
    funcionario
        inner JOIN
    departamento using (idDepto);
    
SELECT 
    funcionario.nomeFunc, projeto.titulo
FROM
    funcionario
        left JOIN
    projfunc USING (idFunc)
        left JOIN
    projeto USING (idProj) order by projeto.titulo;
    
    select funcionario.nomeFunc, count(idProj) NumProjetos from  funcionario
        left JOIN
    projfunc USING (idFunc)
        left JOIN
    projeto USING (idProj) group by idFunc;
    
    select avg(salario) MediaSalario from funcionario;
    
    select nomeFunc, salario from funcionario where salario > (select avg(salario) MediaSalario from funcionario);
    
    select nomeFunc, dataAdm from funcionario where dataAdm = '2020-07-30';
    
    select nomeFunc, dataAdm from funcionario where dataAdm = str_to_date('30/07/2020','%d/%m/%y');
    strtodate