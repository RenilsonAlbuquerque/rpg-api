use rpg2;

/*##################### classifications ###################*/

/*---------------------armas-------------------------------*/
insert into tb_equipament_category(id,name) values (1,"Machado de batalha");
insert into tb_weapon_category(id) values (1);
insert into tb_equipament_category(id,name) values (2,"Machadinha");
insert into tb_weapon_category(id) values (2);
insert into tb_equipament_category(id,name) values (3,"Martelo de Arremesso");
insert into tb_weapon_category(id) values (3);
insert into tb_equipament_category(id,name) values (4,"Martelo de leve");
insert into tb_weapon_category(id) values (4);
insert into tb_equipament_category(id,name) values (5,"Martelo de guerra");
insert into tb_weapon_category(id) values (5);
insert into tb_equipament_category(id,name) values (6,"Espada longa");
insert into tb_weapon_category(id) values (6);
insert into tb_equipament_category(id,name) values (7,"Espada curta");
insert into tb_weapon_category(id) values (7);
insert into tb_equipament_category(id,name) values (8,"Arco longo");
insert into tb_weapon_category(id) values (8);
insert into tb_equipament_category(id,name) values (9,"Arco curto");
insert into tb_weapon_category(id) values (9);
insert into tb_equipament_category(id,name) values (10,"Sabre");
insert into tb_weapon_category(id) values (10);
insert into tb_equipament_category(id,name) values (11,"Besta de mão");
insert into tb_weapon_category(id) values (11);
insert into tb_equipament_category(id,name) values (12,"Faca");
insert into tb_weapon_category(id) values (12);
/*---------------------Ferramentas------------------------*/
insert into tb_equipament_category(id,name) values (13,"Ferramentas de artesão");
insert into tb_tool_category(id) values (13);
insert into tb_equipament_category(id,name) values (14,"Ferramentas de navegação");
insert into tb_tool_category(id) values (14);
insert into tb_equipament_category(id,name) values (15,"Ferramentas de ladrão");
insert into tb_tool_category(id) values (15);
insert into tb_equipament_category(id,name) values (16,"Instrumento musical");
insert into tb_tool_category(id) values (16);
insert into tb_equipament_category(id,name) values (17,"Kit de disfarce");
insert into tb_tool_category(id) values (17);
insert into tb_equipament_category(id,name) values (18,"Kit de falsificação");
insert into tb_tool_category(id) values (18);
insert into tb_equipament_category(id,name) values (19,"Kit de herbalismo");
insert into tb_tool_category(id) values (19);
insert into tb_equipament_category(id,name) values (20,"Kit de jogo");
insert into tb_tool_category(id) values (20);
insert into tb_equipament_category(id,name) values (21,"Kit de venenos");
insert into tb_tool_category(id) values (21);

/*---------------------Adventure gear------------------------*/
insert into tb_equipament_category(id,name) values (22,"Equipamento padrão");
insert into tb_adventure_gear_category(id) values (22);


/*---------------------Armor ---------------------------------*/
insert into tb_equipament_category(id,name) values (23,"Armadura leve");
insert into tb_armor_category(id) values (23);

insert into tb_equipament_category(id,name) values (24,"Armadura média");
insert into tb_armor_category(id) values (24);

insert into tb_equipament_category(id,name) values (25,"Armadura pesada");
insert into tb_armor_category(id) values (25);

insert into tb_equipament_category(id,name) values (26,"Escudo");
insert into tb_armor_category(id) values (26);
/*########################################################*/



insert into tb_equipament_category(id,name) values (22,"Equipamento padrão");
insert into tb_adventure_gear_category(id) values (22);

insert into tb_weapon_classification(id,name) values (1,"Simples");
insert into tb_weapon_classification(id,name) values (2,"Marcial");

insert into tb_weapon_range(id,name) values (1,"Corpo-a-corpo");
insert into tb_weapon_range(id,name) values (2,"à Distância");

insert into tb_weapon_property(id,name,description) values (1,"Acuidade","Quando realizar um ataque com uma arma com a propriedade acuidade, você pode escolher usar seu modificador de Força ou de Destreza para realizar a jogada de ataque e de dano. Você precisa usar o mesmo modificador para ambas as jogadas, ataque e dano");
insert into tb_weapon_property(id,name,description) values (2,"Alcance","Essa arma adiciona 1,5 metro ao seu alcance quando você a usa para atacar. Essa propriedade também determina seu alcance ao realizar ataques de oportunidade com uma arma de alcance.");
insert into tb_weapon_property(id,name,description) values (3,"Arremesso","Se uma arma possuir a propriedade arremesso, você pode arremessar a arma para realizar um ataque à distância. Se essa arma for uma arma de ataque corpo-a-corpo, você usa o mesmo modificador de habilidade para as jogadas de ataque e dano que usaria para realizar um ataque corpo-a-corpo com a arma. Por exemplo, se você arremessar uma machadinha, ele usa seu modificador de Força, mas se arremessar uma adaga, você pode usar tanto seu modificador de Força quanto o de Destreza, pois a adaga possui a propriedade acuidade.");
insert into tb_weapon_property(id,name,description) values (4,"Distância","Uma arma que pode ser usada para realizar ataques à distância possui a distância mostrada entre parênteses após a propriedade munição ou arremesso. A distância lista dois números. O primeiro é a distância normal da arma, o segundo indica a distância máxima da arma, ambos em metros. Quando atacar um alvo que está além da distância normal da arma, você possui desvantagem na jogada de ataque. Você não pode atacar um alvo que esteja além da distância máxima da arma.");
insert into tb_weapon_property(id,name,description) values (5,"Duas mãos","Essa arma requer as duas mãos para ser usada. Essa propriedade só é relevante quando você ataca com a arma, não enquanto apenas a segura");
insert into tb_weapon_property(id,name,description) values (6,"Especial","Uma arma com a propriedade especial possui regras diferenciadas que detalham seu uso, explicado na descrição da arma");
insert into tb_weapon_property(id,name,description) values (7,"Leve","Uma arma leve é pequena e de fácil manuseio, tornando-a ideal para usar quando você está combatendo com duas armas.");
insert into tb_weapon_property(id,name,description) values (8,"Munição","Você pode usar uma arma que tenha a propriedade munição para realizar um ataque à distância, apenas se possuir munição para disparar a arma. Cada vez que você atacar com a arma, você gasta uma peça de munição. Sacar a munição de uma aljava, bolsa, ou outro recipiente faz parte do ataque. No fim da batalha, você pode recuperar metade de sua munição gasta, se tiver um minuto para procurar pelo campo de batalha. Recarregar uma arma de uma mão requer uma mão livre.");
insert into tb_weapon_property(id,name,description) values (9,"Pesada","Criaturas pequenas têm desvantagem nas jogadas de ataque com estas armas. O tamanho e o peso de uma arma pesada tornam-na muito grande para ser empunhada eficientemente por criaturas Pequenas.");
insert into tb_weapon_property(id,name,description) values (10,"Recarga","Devido o tempo necessário para recarregar essa arma, você pode disparar apenas uma peça de munição da arma quando usa uma ação, ação bônus, ou reação para disparar, não importando quantos ataques você possua.");
insert into tb_weapon_property(id,name,description) values (11,"Versátil","Essa arma pode ser usada com uma ou duas mãos. Um valor de dano aparece entre parênteses com a propriedade – é o dano da arma quando usada com as duas mãos para efetuar ataques corpo-a-corpo.");

/*##################### Weapon ###########################*/
insert into tb_cost(id,quantity,coin_id) value (1,2,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id)
values (1,'https://vignette.wikia.nocookie.net/dnd4/images/8/83/P201H.jpg/revision/latest/scale-to-width-down/200?cb=20150119125601',
'adaga','Agada simples e comum, pode ser de qualquer metal',0.5,1,1);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (1,0,12,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (1,1,9,0,1);


insert into tb_cost(id,quantity,coin_id) value (2,350000,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id)
values (2,'https://media-waterdeep.cursecdn.com/avatars/thumbnails/7/253/1000/1000/636284739956618526.jpeg',
'Vingadora sagrada','Um tipo raro de espada forjada para combater o mal em todas as suas formas, almejada por paladinos de todos os reinos
.Possui magnificos poderes que apenas se mostram nas mãos de um guerreiro benevolente',1.5,2,5);
insert into tb_weapon(bonus,id,category_id,classification_id,range_id) values (3,2,6,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (2,3,11,0,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (2,4,11,0,1);

   

    