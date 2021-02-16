use rpg2;
use heroku_b7136ebab5eff09;
/*##################### classifications ###################*/

/*---------------------armas-------------------------------*/

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
insert into tb_equipament_category(id,name) values (13,"Lança");
insert into tb_weapon_category(id) values (13);
insert into tb_equipament_category(id,name) values (14,"Maça");
insert into tb_weapon_category(id) values (14);
insert into tb_equipament_category(id,name) values (15,"Porrete");
insert into tb_weapon_category(id) values (15);
insert into tb_equipament_category(id,name) values (16,"Dardo");
insert into tb_weapon_category(id) values (16);
insert into tb_equipament_category(id,name) values (17,"Funda");
insert into tb_weapon_category(id) values (17);
insert into tb_equipament_category(id,name) values (18,"Cimitarra");
insert into tb_weapon_category(id) values (18);
insert into tb_equipament_category(id,name) values (19,"Chicote");
insert into tb_weapon_category(id) values (19);
insert into tb_equipament_category(id,name) values (20,"Espada grande");
insert into tb_weapon_category(id) values (20);
insert into tb_equipament_category(id,name) values (21,"Lança de montaria");
insert into tb_weapon_category(id) values (21);
insert into tb_equipament_category(id,name) values (22,"Lança longa");
insert into tb_weapon_category(id) values (22);
insert into tb_equipament_category(id,name) values (23,"Maça estrela");
insert into tb_weapon_category(id) values (23);
insert into tb_equipament_category(id,name) values (24,"Machado grande");
insert into tb_weapon_category(id) values (24);
insert into tb_equipament_category(id,name) values (25,"Mangual");
insert into tb_weapon_category(id) values (25);
insert into tb_equipament_category(id,name) values (26,"Picareta de guerra");
insert into tb_weapon_category(id) values (26);
insert into tb_equipament_category(id,name) values (27,"Rapieira");
insert into tb_weapon_category(id) values (27);
insert into tb_equipament_category(id,name) values (28,"Tridente");
insert into tb_weapon_category(id) values (28);
insert into tb_equipament_category(id,name) values (29,"Besta");
insert into tb_weapon_category(id) values (29);
insert into tb_equipament_category(id,name) values (30,"Zarabatana");
insert into tb_weapon_category(id) values (30);

/*---------------------Armor ---------------------------------*/
insert into tb_equipament_category(id,name) values (31,"Armadura leve");
insert into tb_armor_category(id) values (31);

insert into tb_equipament_category(id,name) values (32,"Armadura média");
insert into tb_armor_category(id) values (32);

insert into tb_equipament_category(id,name) values (33,"Armadura pesada");
insert into tb_armor_category(id) values (33);

insert into tb_equipament_category(id,name) values (34,"Escudo");
insert into tb_armor_category(id) values (34);


/*---------------------Ferramentas------------------------*/
insert into tb_equipament_category(id,name) values (35,"Ferramentas de artesão");
insert into tb_tool_category(id) values (35);
insert into tb_equipament_category(id,name) values (36,"Ferramentas de navegação");
insert into tb_tool_category(id) values (36);
insert into tb_equipament_category(id,name) values (37,"Ferramentas de ladrão");
insert into tb_tool_category(id) values (37);
insert into tb_equipament_category(id,name) values (38,"Instrumento musical");
insert into tb_tool_category(id) values (38);
insert into tb_equipament_category(id,name) values (39,"Kit de disfarce");
insert into tb_tool_category(id) values (39);
insert into tb_equipament_category(id,name) values (40,"Kit de falsificação");
insert into tb_tool_category(id) values (40);
insert into tb_equipament_category(id,name) values (41,"Kit de herbalismo");
insert into tb_tool_category(id) values (41);
insert into tb_equipament_category(id,name) values (42,"Kit de jogo");
insert into tb_tool_category(id) values (42);
insert into tb_equipament_category(id,name) values (43,"Kit de venenos");
insert into tb_tool_category(id) values (43);


/*---------------------Adventure gear------------------------*/
insert into tb_equipament_category(id,name) values (44,"Equipamento padrão");
insert into tb_adventure_gear_category(id) values (44);



/*########################################################*/
/*##################### Base Weapon ###########################*/
/*--Adaga--*/
insert into tb_cost(id,quantity,coin_id) value (1,2,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (1,'https://vignette.wikia.nocookie.net/dnd4/images/8/83/P201H.jpg/revision/latest/scale-to-width-down/200?cb=20150119125601',
'Adaga','Agada simples e comum, pode ser de qualquer metal',0.5,1,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (1,0,12,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (1,1,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (1,1);
insert into mtm_weapon_property(weapon_id,property_id) values (1,3);
insert into mtm_weapon_property(weapon_id,property_id) values (1,7);

/*--Azagaia--*/
insert into tb_cost(id,quantity,coin_id) value (2,5,4);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (2,'https://i.pinimg.com/originals/e3/b4/98/e3b4987c5e4b53e776989b5cbe6d5131.jpg','Azagaia',
'Azagaia simples e comum, pode ser de qualquer metal',1,2,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (2,0,12,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (2,2,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (2,1);

/*--Bordão--*/
insert into tb_cost(id,quantity,coin_id) value (3,2,4);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (3,'http://2.bp.blogspot.com/-q_ym6jCDdJ8/Vo7sDWKXm4I/AAAAAAAAq4w/f4YWCNI3VFE/s1600/84383303.6bbL00WU.ShamansStaff.jpg','Bordão',
'um cajado apreciado por viajantes e camponeses, por sua praticidade e preço - assim como uma clava, seu custo é zero. O bordão é uma arma dupla (você pode usá-lo com os talentos Combater com Duas Armas e Bloqueio Ambidestro). O bordão é também uma arma de monge (significa que pode ser usado com determinadas habilidades, como a rajada de golpes).
',2,3,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (3,0,12,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (3,2,2,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (3,11);

/*--Clava grande--*/
insert into tb_cost(id,quantity,coin_id) value (4,2,4);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (4,'https://http2.mlstatic.com/D_NQ_NP_810915-MLB31674182344_082019-O.jpg','Clava grande',
'um pedaço de madeira empunhado como arma, geralmente usado por bárbaros ou criaturas brutais - ou como arma improvisada, como um galho de árvore ou pedaço de mobília. Sendo fácil de conseguir, seu preço é zero.',
5,4,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (4,0,12,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (3,3,2,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (4,9);
insert into mtm_weapon_property(weapon_id,property_id) values (4,5);

/*--Foice curta--*/
insert into tb_cost(id,quantity,coin_id) value (5,1,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (5,'http://qualquercoisa3.weebly.com/uploads/2/8/8/9/28899449/982105515.png?232','Foice Curta',
'diferente da ferramenta usada por fazendeiros, uma foice de combate é bem mais forte e balanceada. Capaz de infligir ferimentos precisos e letais.',
1,5,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (5,0,12,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (5,1,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (5,7);

/*--Lança--*/
insert into tb_cost(id,quantity,coin_id) value (6,1,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (6,'https://i.pinimg.com/originals/a7/85/bf/a785bfdb4817a265a21f086e085183f9.jpg','Lança',
' é qualquer arma feita com uma haste de madeira e ponta afiada, natural ou metálica. Por sua facilidade de fabricação, é muito comum entre diversas raças menos civilizadas. Uma lança também pode ser arremessada.',
1.5,6,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (6,0,13,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (6,2,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (6,7);

/*--Maça--*/
insert into tb_cost(id,quantity,coin_id) value (7,5,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (7,'https://cdn.shopify.com/s/files/1/0226/6487/2010/products/pole004a_300x.jpg?v=1563739962','Maça',
'composta por um bastão metálico com um peso cheio de protuberâncias na estremidade, a maça é muito usada por clérigos que fazem votos de não derramar sangue. De fato, um golpe de maça nem sempre derrama sangue, mas pode esmagar algum ossos.',
2,7,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (7,0,14,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (7,2,9,0,1);


/*--Machadinha--*/
insert into tb_cost(id,quantity,coin_id) value (8,5,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (8,'https://i.pinimg.com/564x/a4/bf/86/a4bf86acc8ed28c58a75a742a2acf565.jpg','Machadinha',
'uma ferramenta bem útil para cortar madeira, e também inimigos. Uma machadinha pode ser arremessada.',1,8,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (8,0,2,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (8,2,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (8,7);
insert into mtm_weapon_property(weapon_id,property_id) values (8,3);


/*--Martelo leve--*/
insert into tb_cost(id,quantity,coin_id) value (9,2,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (9,'https://a-static.mlcdn.com.br/1500x1500/martelo-medieval-do-thor-bazar/extrafestas/9850/215fc78e6b687eab98966b264ea5ee01.jpg','Matelo leve',
'em sua essência é uma ferramenta para bater pregos, em caso de problemas uma arma pra bater em inimigos.',1,9,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (9,0,4,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (9,1,2,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (9,3);
insert into mtm_weapon_property(weapon_id,property_id) values (9,7);

/*--Porrete--*/
insert into tb_cost(id,quantity,coin_id) value (10,1,4);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (10,'https://http2.mlstatic.com/D_NQ_NP_616747-MLB31055894276_062019-O.jpg','Porrete',
'Feito para dar porrada',1,10,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (10,0,15,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (10,1,2,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (10,7);


/*--Arco curto--*/
insert into tb_cost(id,quantity,coin_id) value (11,25,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (11,'https://i.pinimg.com/564x/f3/42/ed/f342edc7335add606dc41b388f7c2286.jpg','Arco Curto',
'Este arco bastante comum é próprio para caçadas, muito usado por povos selvagens ou caçadores — o tamanho pequeno é apropriado para manuseio em florestas e outros ambientes fechados. Exige as duas mãos.',
1,11,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (11,0,9,1,2);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (11,2,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (11,5);
insert into mtm_weapon_property(weapon_id,property_id) values (11,7);

/*--Besta leve--*/
insert into tb_cost(id,quantity,coin_id) value (12,25,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (12,'https://i.stack.imgur.com/0EadT.jpg','Besta Leve',
'um arco montado sobre uma coronha de madeira com um gatilho, a besta leve é uma arma que dispara virotes com grande potência. Recarregar uma besta leve é uma ação de movimento. Exige as duas mãos.',
2.5,12,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (12,0,11,1,2);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (12,3,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (12,5);
insert into mtm_weapon_property(weapon_id,property_id) values (12,7);
insert into mtm_weapon_property(weapon_id,property_id) values (12,10);



/*--Dardo--*/
insert into tb_cost(id,quantity,coin_id) value (13,5,5);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (13,'https://lojareidasespadas.com/14326-home_default/https-wwwlojareidasespadascomcabeca-de-seta-de-caca-forjada-produtos-nossos-parafusos-medievais-para-bestas-medem-aprox-33-cm-no.jpg','Dardo',
'Dardo de mão, pode ser normal ou tranquilizante.',0.1,13,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (13,0,16,1,2);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (13,1,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (13,1);
insert into mtm_weapon_property(weapon_id,property_id) values (13,3);

/*--Funda--*/
insert into tb_cost(id,quantity,coin_id) value (14,1,4);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (14,'https://i.pinimg.com/564x/4d/91/a6/4d91a6ca3832208e16455711d1496b2e.jpg','Funda',
'podendo ser feita com uma simples tira de couro, é usada para arremessar balas de metal. Na falta de munição adequada, uma funda também pode disparar pedras comuns, mas o dano é reduzido para 1d3. Colocar uma bala em uma funda é uma ação de movimento. Ao contrário de outras armas de disparo, você aplica seu modificador de Força a jogadas de dano com uma funda.',
0,14,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (14,0,17,1,2);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (14,1,2,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (14,8);


/*--Alabarda--*/
insert into tb_cost(id,quantity,coin_id) value (15,20,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (15,'https://www.medievalfactory.com/16869-medium_default/ALABARDA-MEDIEVAL.jpg','Alabarda',
'Uma arma composta por uma longa haste. A haste é rematada por uma peça pontiaguda, de metal, que por sua vez é atravessada por uma lâmina em forma de meia-lua (similar à de um machado). É considerada a arma de infantaria mais eficaz contra invasores em fortificações e muralhas. É por excelência a arma usada pelos guardas de castelos e palácios e ainda hoje aparece como o padrão em unidades militares. Muitos nobres a mantém em suas paredes para fins decorativos, tratadas como peças de arte.',
3,15,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (15,0,13,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (15,4,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (15,2);
insert into mtm_weapon_property(weapon_id,property_id) values (15,5);
insert into mtm_weapon_property(weapon_id,property_id) values (15,9);


/*--Cimitarra--*/
insert into tb_cost(id,quantity,coin_id) value (16,25,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (16,'https://i.pinimg.com/564x/a8/5b/19/a85b1947c1e633dcf4da1a461f2360e8.jpg','Cimitarra',
'uma espada com a lâmina curva, leve e muito afiada. O talento Acuidade com Arma se aplica à cimitarra.',
1.5,16,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (16,0,18,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (16,2,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (16,1);
insert into mtm_weapon_property(weapon_id,property_id) values (16,7);

/*--Chicote--*/
insert into tb_cost(id,quantity,coin_id) value (17,2,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (17,'https://www.casadocarnaval.pt//upload/product/828-chicote-em-pele-mt_1344878314.jpg','Chicote',
'Você pode atacar um inimigo a até 4,5m com um chicote. Esta arma pode se enroscar na mãos, pernas ou armas do adversário; você recebe +4 em jogadas de ataque para derrubar ou desarmar. O talento Acuidade com Arma se aplica ao chicote.',
1.5,16,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (17,0,19,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (17,1,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (17,1);
insert into mtm_weapon_property(weapon_id,property_id) values (17,2);


/*--Espada Curta--*/
insert into tb_cost(id,quantity,coin_id) value (18,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (18,'https://images.squarespace-cdn.com/content/578aa530725e2593d407843b/1516381578531-JAF11Z01LFQT36KRCCOG/ArchetypeWeapon_1H_Shortsword01_icon.png?content-type=image%2Fpng','Espada curta',
'É o mais comum tipo de espada, muito usada por milicianos e soldados rasos - ou ainda como arma secundária. Possui entre 40 a 50 cm de comprimento',
1,18,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (18,0,7,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (18,2,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (18,1);
insert into mtm_weapon_property(weapon_id,property_id) values (18,7);

/*--Espada Grande--*/
insert into tb_cost(id,quantity,coin_id) value (19,50,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (19,'https://images-na.ssl-images-amazon.com/images/I/51IeAWMUkqL._AC_SL1001_.jpg','Espada grande',
'Uma arma enorme e muito pesada, esta espada tem cerca de 1,5m de comprimento. É uma das armas mais poderosas que um criatura Média consegue empunhar.',
3,19,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (19,0,20,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (19,2,3,0,2);
insert into mtm_weapon_property(weapon_id,property_id) values (19,5);
insert into mtm_weapon_property(weapon_id,property_id) values (19,9);

/*--Espada Longa--*/
insert into tb_cost(id,quantity,coin_id) value (20,15,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (20,'https://i.pinimg.com/564x/5e/e4/0e/5ee40e582199f6d36a40d4e4265c5b32.jpg','Espada longa',
'Em geral, são chamadas de "espadas longas" espadas com 85 cm a 1,15 m de comprimento total e peso entre 0,9 kg e 1,5 kg. Não existe uma convenção precisa sobre os limites entre espadas curtas e longas, mas a diferença entre espadas longas e bastardas é marcada pelo tamanho da empunhadura - as bastardas têm uma empunhadura bem mais longa, que permite serem seguradas com as duas mãos. A maioria das espadas longas tinha dois gumes e ponta rombuda, servindo apenas para cortar. Espadas de ponta perfurante, mais comuns no sul do continente, popularizaram-se pouco tempo depois.',
1.5,20,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (20,0,6,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (20,3,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (20,11);

/*--Glaive--*/
insert into tb_cost(id,quantity,coin_id) value (21,20,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (21,'https://i.pinimg.com/564x/05/c3/31/05c33121674495c9d2e97843583f5737.jpg','Glaive',
'Um glaive é uma arma de guerra européia, que consiste em uma lâmina de um gume na ponta de uma vara. É semelhante ao naginata japonês, ao guandao e pudao chinês, ao woldo coreano, ao sovnya russo e à palma siberiana.',
3,21,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (21,0,13,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (21,4,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (21,2);
insert into mtm_weapon_property(weapon_id,property_id) values (21,5);
insert into mtm_weapon_property(weapon_id,property_id) values (21,9);


/*--Lança de montaria--*/
insert into tb_cost(id,quantity,coin_id) value (22,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (22,'https://www.kindpng.com/picc/m/251-2518202_soldier-sword-png-high-quality-image-final-fantasy.png','Lança de montaria',
'quando montado, você pode utilizar essa arma com apenas uma mão. A lança montada é uma arma de haste, e causa dano dobrado se usada durante uma investida montada.',
3,22,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (22,0,21,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (22,5,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (22,2);
insert into mtm_weapon_property(weapon_id,property_id) values (21,6);


/*--Lança longa--*/
insert into tb_cost(id,quantity,coin_id) value (23,5,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (23,'https://i.pinimg.com/564x/e4/95/54/e49554ccd1778a6d38caef3112cdaa0d.jpg','Lança longa',
'Uma haste de metal ou madeira comprida com uma ponta perfurante de aço, ferro ou madeira.É uma versão mais pesada e longa da lança normal.',
4,23,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (23,0,22,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (23,4,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (23,2);
insert into mtm_weapon_property(weapon_id,property_id) values (23,5);
insert into mtm_weapon_property(weapon_id,property_id) values (23,9);

/*--Maça estrela--*/
insert into tb_cost(id,quantity,coin_id) value (24,15,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (24,'https://i.pinimg.com/564x/43/ad/75/43ad756b77b88eb5e05348fde37102e4.jpg','Maça estrela',
'Uma maça-estrela tem espinhos pontiagudos, sendo mais perigosa que uma maça comum. É uma arma rústica, mas capaz de ferimentos profundos',
2,24,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (24,0,23,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (24,3,9,0,1);

/*--Machado grande--*/
insert into tb_cost(id,quantity,coin_id) value (25,30,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (25,'https://i.pinimg.com/originals/8a/98/54/8a98546a80dbeb9a619c5454cb11ccb8.png','Machado grande',
'Este imenso machado de lâmina dupla é uma das mais perigosas armas existentes.',
3.5,25,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (25,0,24,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (25,5,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (25,5);
insert into mtm_weapon_property(weapon_id,property_id) values (25,9);

/*--Machado de batalha--*/
insert into tb_cost(id,quantity,coin_id) value (26,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (26,'https://thumbs.dreamstime.com/b/machado-velho-da-batalha-isolado-38346689.jpg','Machado de batalha',
'Diferente de uma machadinha, este não é um simples instrumento para cortes de árvores, mas sim uma poderosa arma capaz de causar ferimentos terríveis.',
2,26,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (26,0,1,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (26,3,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (26,11);

/*--Malho--*/
insert into tb_cost(id,quantity,coin_id) value (27,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (27,'https://i.pinimg.com/564x/c8/92/8c/c8928ce8e3e1f270d6538924d149e60a.jpg','Malho',
'Um martelo grande capaz de esmagar ossos e paredes',
5,27,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (27,0,5,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (27,2,2,0,2);
insert into mtm_weapon_property(weapon_id,property_id) values (27,5);
insert into mtm_weapon_property(weapon_id,property_id) values (27,9);

/*--Mangual--*/
insert into tb_cost(id,quantity,coin_id) value (28,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (28,'https://www.darkknightarmoury.com/wp-content/uploads/2019/10/ME-0123.jpg','Mangual',
'Arma composta por uma haste metálica ligada a uma corrente que por sua vez é ligada a uma esfera de aço.
O mangual pode se enroscar na arma do adversário; você recebe +4 em jogadas de ataque para desarmar.',
1,28,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (28,0,25,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (28,3,2,0,1);

/*--Martelo de Guerra--*/
insert into tb_cost(id,quantity,coin_id) value (29,15,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (29,'https://i.pinimg.com/564x/15/34/9c/15349c0c5fed085c09f4ee94b1a2ad5e.jpg','Martelo de guerra',
'Mais uma ferramenta modificada para combate. É muito eficiente contra alguns tipos de mortos-vivos, por exemplo esqueletos. Também é a arma preferida de quase todos os anões que recusam os machados.',
1,29,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (29,0,5,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (29,3,2,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (29,11);

/*--Picareta de Guerra--*/
insert into tb_cost(id,quantity,coin_id) value (30,15,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (30,'https://64.media.tumblr.com/fa12a23d7ab32e0ee58b4dd3c7c12e0a/f1b36e824d7cab3e-3c/s400x600/1ab98c0a1b2d233e22af637e44a9fab12d120cc7.png','Picareta de guerra',
'Uma ferramenta análoga ao martelo que consiste em uma cabeça de metal pontiaguda fixada na ponta de um cabo comprido feito usualmente de madeira. Seu principal uso é quebrar pedras e rochas, sendo muito utilizada em minas e obras para escavação de túneis, onde o trabalho para quebrar as pedras é manual. Alpinistas também fazem uso de picaretas especiais, principalmente quando realizam escalada no gelo. A função da picareta neste caso é prover um ponto de fixação no gelo ou simplesmente para quebrá-lo para abrir caminho.',
1,30,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (30,0,26,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (30,3,9,0,1);

/*--Rapieira--*/
insert into tb_cost(id,quantity,coin_id) value (31,25,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (31,'https://i.pinimg.com/564x/d7/27/a7/d727a706188e0f83a765f5b362ac81c4.jpg','Rapieira',
'é um tipo de espada que surgiu na Idade Moderna quando as armas de fogo começaram a dominar o campo de batalha, tornando obsoletos os escudos e as armaduras medievais, mas ainda exigiam o complemento de uma espada como arma de defesa, devido à lentidão para carregá-las. Seu uso iniciou-se, porém, como arma de defesa pessoal de nobres em ambiente civil. Essas espadas têm dois gumes e podem ser usadas para acutilar, mas sua agilidade as torna mais adequadas para estocar.',
1,31,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (31,0,27,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (31,3,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (31,1);

/*--Tridente--*/
insert into tb_cost(id,quantity,coin_id) value (32,5,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (32,'https://i.pinimg.com/564x/1c/41/f8/1c41f825d68e05f771558442fa66c2d9.jpg','Tridente',
'o tridente, garfo ou forcado é uma arma branca que se assemelha a uma lança, mas com duas, três ou mais lâminas ou ponteiras que acabam por enfraquecer o poder penetrante da lança (quando não há a armadura), sendo aperfeiçoado para uso dos minotauros, com a transformação do terminal do cabo ou empunhadura numa lâmina ou agulha penetrante, semelhante à lança de arremesso (imprópria para a cavalaria).',
2,32,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (32,0,28,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (32,2,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (32,3);
insert into mtm_weapon_property(weapon_id,property_id) values (32,11);


/*--Arco longo--*/
insert into tb_cost(id,quantity,coin_id) value (33,50,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (33,'https://i.pinimg.com/564x/a6/b2/4d/a6b24dffd9704a7269ec2493c3972b10.jpg','Arco longo',
'Este arco reforçado tem a altura de uma pessoa. Diferente do arco curto, é próprio para campos de batalha e outras áreas abertas — seu longo alcance permite atingir o inimigo a grandes distâncias. Exige as duas mãos.',
1,33,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (33,0,8,2,2);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (33,3,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (33,5);
insert into mtm_weapon_property(weapon_id,property_id) values (33,8);
insert into mtm_weapon_property(weapon_id,property_id) values (33,9);

/*--Besta de mão--*/
insert into tb_cost(id,quantity,coin_id) value (34,75,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (34,'https://i.pinimg.com/564x/51/ec/02/51ec0257952d08972e2c8c26015cd25f.jpg','Besta de mão',
'uma besta em miniatura, ideal para ser escondida sob um casaco, e usada por nobres e jogadores. Se você sacar a besta de mão, e na mesma rodada, usá-la para atacar, o oponente fica desprevenido contra esse ataque (mas esse truque só funciona uma vez por combate). Recarregar esta arma é uma ação de movimento. Exige uma mão.',
1.5,34,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (34,0,29,2,2);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (34,2,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (34,7);
insert into mtm_weapon_property(weapon_id,property_id) values (34,8);
insert into mtm_weapon_property(weapon_id,property_id) values (34,10);

/*--Besta pesada--*/
insert into tb_cost(id,quantity,coin_id) value (35,50,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (35,'https://www.medievalcollectibles.com/wp-content/uploads/2020/06/ME-0014.jpg','Besta pesada',
'Versão maior e mais potente da besta leve. Recarregar uma besta pesada é uma ação padrão. Usar esta besta também exige as duas mãos.',
4.5,35,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (35,0,29,2,2);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (35,4,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (35,5);
insert into mtm_weapon_property(weapon_id,property_id) values (35,8);
insert into mtm_weapon_property(weapon_id,property_id) values (35,9);
insert into mtm_weapon_property(weapon_id,property_id) values (35,10);

/*--Zarabatana--*/
insert into tb_cost(id,quantity,coin_id) value (36,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (36,'https://i.pinimg.com/564x/05/7a/5b/057a5b60bc168196e7fb70ea67a91d6d.jpg','Zarabatana',
'A zarabatana é uma arma que consiste num tubo originalmente de madeira, e hoje de metal ou plástico, pelo qual são soprados pequenos dardos, setas ou projécteis. A zarabatana é uma arma, não um brinquedo, podendo infligir danos graves.',
0.5,36,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (36,0,30,2,2);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (36,1,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (36,8);

/*########################################################*/
/*##################### Base Armor ###########################*/
/*--Armadura alcochoada--*/
insert into tb_cost(id,quantity,coin_id) value (37,5,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (37,'https://images.squarespace-cdn.com/content/v1/59aa8bee197aea4ad67f52ae/1504388096180-GXQ5CU6U9P3MZLJMY9SZ/ke17ZwdGBToddI8pDm48kMFHsobaOCQT6BUfPDhHErlZw-zPPgdn4jUwVcJE1ZvWEtT5uBSRWt4vQZAgTJucoTqqXjS3CfNDSuuf31e0tVEJg4aYXu8LbvyDOr2csRPU2eKenc2gw9phkBneUz-a1jqWIIaSPh2v08GbKqpiV54/Western-Armor_0011_padded.png?format=1000w','Armadura Acolchoada',
'Composta por várias camadas de tecido sobrepostas. É a armadura mais leve, mas também é a que oferece menos proteção.',
4,36,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (37,11,10,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(37,0,0,true,31,37);

/*--Armadura de couro--*/
insert into tb_cost(id,quantity,coin_id) value (38,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (38,'https://i.pinimg.com/originals/84/73/d9/8473d9e9a67c4d0860bdcfd87a4d9877.png','Armadura de couro',
'o peitoral desta armadura é feito de couro curtido em óleo fervente, para ficar mais rígido, enquanto as demais partes são feitas de couro flexível.',
5,38,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (38,11,10,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(38,0,0,false,31,38);

/*--Armadura de couro batido--*/
insert into tb_cost(id,quantity,coin_id) value (39,45,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (39,'https://i.pinimg.com/originals/74/b4/f7/74b4f77e4e2d5fa652774c08a0b861f2.jpg','Armadura de couro batido',
'Versão mais pesada do corselete de couro, reforçada com rebites de metal.',
6,39,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (39,12,10,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(39,0,0,false,31,39);


/*--Gibão de peles--*/
insert into tb_cost(id,quantity,coin_id) value (40,15,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (40,'https://i.pinimg.com/564x/07/a1/aa/07a1aa7fc90382e3fc9704c93d80b1cb.jpg','Gibão de peles',
'Usada principalmente por bárbaros e selvagens, esta armadura é formada por várias camadas de peles e couro de animais.',
7.5,40,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (40,12,2,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(40,0,0,false,32,40);

/*--Camisão de malha--*/
insert into tb_cost(id,quantity,coin_id) value (41,50,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (41,'https://i.pinimg.com/originals/ce/3e/e7/ce3ee78998e0871e8dfd248e2fb02330.png','Camisão de malha',
'Versão mais leve da cota de malha, cobrindo apenas o torso.',
8,41,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (41,13,2,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(41,0,0,false,32,41);

/*--Brunea--*/
insert into tb_cost(id,quantity,coin_id) value (42,75,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (42,'https://i.pinimg.com/564x/4b/4a/b2/4b4ab2f69ec4a2941d193abd46b56512.jpg','Brunea',
'colete de couro coberto com plaquetas de metal sobrepostas, como escamas de um peixe',
12.5,42,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (42,14,2,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(42,0,0,true,32,42);

/*--Peitoral--*/
insert into tb_cost(id,quantity,coin_id) value (43,150,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (43,'https://images-na.ssl-images-amazon.com/images/I/71ODf-75lPL._AC_UL1500_.jpg','Peitoral',
'Peitoral de aço que protege o peito e as costas. Popular entre nobres e oficiais.',
10,43,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (43,14,2,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(43,0,0,false,32,43);

/*--Meia armadura--*/
insert into tb_cost(id,quantity,coin_id) value (44,500,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (44,'https://www.outfit4events.com/runtime/cache/images/redesignProductMiddle/mib_0005j.JPG','Meia Armadura',
'Combinação de cota de malha e placas de metal posicionadas sobre as áreas vitais.',
15,44,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (44,15,2,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(44,0,0,true,32,44);

/*--Cota de malha anelar--*/
insert into tb_cost(id,quantity,coin_id) value (45,75,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (45,'https://i.pinimg.com/originals/fe/46/31/fe46316d63ee35237cfb2a9b4eae11e0.png','Cota de malha anelar',
'Longa veste de anéis metálicos interligados, formando uma malha flexível e resistente, que vai até os joelhos.',
17.5,45,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (45,15,0,null);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(45,0,13,true,33,45);

/*--Loriga--*/
insert into tb_cost(id,quantity,coin_id) value (46,200,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (46,'https://www.mareg.net/media/654/catalog/lorica-segmentata-corbridge-a.gif?size=600','Loriga',
'Composta de tiras horizontais de metal, esta armadura é pesada e resistente. Peça muito utilizada por legionários minotauros.',
20,46,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (46,16,0,null);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(46,0,13,true,33,46);

/*--Cota de talas--*/
insert into tb_cost(id,quantity,coin_id) value (47,750,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (47,'https://i.pinimg.com/564x/2a/ef/e3/2aefe3fd34ad1c7e2b6c1020e8d70e18.jpg','Cota de talas',
'Armadura composta de talas de metal cuidadosamente costuradas sobre um corselete de couro. É a armadura tradicional do samurai, embora exista em versões nativas de todos os reinos.',
22,47,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (47,17,0,null);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(47,0,15,true,33,47);

/*--Placas--*/
insert into tb_cost(id,quantity,coin_id) value (48,1500,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (48,'https://i.pinimg.com/originals/6b/3c/26/6b3c26a15f161180cd8a3018a75555c1.png','Placas',
'a mais forte e pesada, formada por placas de metal forjadas e encaixadas de modo a cobrir o corpo inteiro. Inclui manoplas e grevas (luvas e botas metálicas, respectivamente), um elmo com viseira e um colete acolchoado para ser usado sob as placas. Correias e fivelas distribuem o peso da armadura pelo corpo inteiro.
Esta armadura precisa ser feita sob medida para cada usuário; um ferreiro cobra 500 PO para adaptar uma armadura completa a um novo usuário.',
25,48,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (48,18,0,null);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(48,0,15,true,33,48);

/*--Escudo--*/
insert into tb_cost(id,quantity,coin_id) value (49,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (49,'https://i.pinimg.com/564x/d2/58/a8/d258a89876bf2cdc90682b6206682d65.jpg','Escudo',
'Esse escudo de aço é preso ao antebraço e também deve ser empunhado com firmeza, impedindo o usuário de usar aquela mão.',
3,49,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (49,2,0,null);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(49,0,0,false,34,49);
/*=======================*/

/*======================Tools=========================*/
/*--Ferramenta de Carpinteiro--*/
insert into tb_cost(id,quantity,coin_id) value (50,8,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (50,'https://i2.wp.com/nerdarchy.com/wp-content/uploads/2018/06/tools.png?resize=850%2C340&ssl=1','Ferramentas de carpinteiro',
'Conjunto de ferramentas de capintaria. Contém uma serra, um martelo, pregos, uma machadinha, um
esquadro, uma régua, uma plaina e um formão',
3,50,1,0,0,0);
insert into tb_tool(id,category_id) values(50,35);

/*--Ferramenta de cartógrafo--*/
insert into tb_cost(id,quantity,coin_id) value (51,15,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (51,'https://i2.wp.com/nerdarchy.com/wp-content/uploads/2020/06/cartographers-tools.jpg?resize=640%2C402&ssl=1','Ferramentas de cartógrafo',
'Conjunto de ferramentas de cartografia, consiste de uma pena, tinta, pergaminhos, um par de compassos,
pinças e uma régua.',
3,51,1,0,0,0);
insert into tb_tool(id,category_id) values(51,35);

/*--Ferramenta de costureiro--*/
insert into tb_cost(id,quantity,coin_id) value (52,1,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (52,'https://designmycostume.com/wp-content/uploads/2018/02/108.jpg','Ferramentas de costureiro',
'Conjunto de ferramentas de costureiro. Inclui
linhas, agulhas e retalhos de tecido. Você sabe como
trabalhar em um tear, mas tal equipamento é grande
demais para ser transportado.',
2.5,52,1,0,0,0);
insert into tb_tool(id,category_id) values(52,35);   

/*--Ferramenta de coureiro--*/
insert into tb_cost(id,quantity,coin_id) value (53,5,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (53,'https://i.pinimg.com/564x/eb/04/b9/eb04b93d4d3c8076a786030e3d567a76.jpg','Ferramentas de coureiro',
'Conjunto de ferramentas de coureiro. consistem
de uma espátula, um martelo, um formão, broxa e um
esquadro.',
2.5,53,1,0,0,0);
insert into tb_tool(id,category_id) values(53,35);   

/*--Ferramenta de entalhador--*/
insert into tb_cost(id,quantity,coin_id) value (54,1,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (54,'https://i.pinimg.com/564x/8c/c5/d0/8cc5d0840e0cfa8fe1d9a34a0307a448.jpg','Ferramentas de entalhador',
'Conjunto de ferramentas de entalhador. Contém
de uma faca, uma talhadeira e uma pequena serra.',
2.5,54,1,0,0,0);
insert into tb_tool(id,category_id) values(54,35); 

/*--Ferramenta de ferreiro--*/
insert into tb_cost(id,quantity,coin_id) value (55,20,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (55,'https://i.pinimg.com/564x/d8/c5/36/d8c536185380609037351ba4f037fba4.jpg','Ferramentas de ferreiro',
'Conjunto de ferramentas de ferreiro. Inclui uma
pequena lixa, um conjunto de gazuas, um pequeno
espelho em um suporte de metal, um conjunto de
tesouras de lâmina estreita e um par de alicates.',
4,55,1,0,0,0);
insert into tb_tool(id,category_id) values(55,35);  

/*--Ferramenta de funileiro--*/
insert into tb_cost(id,quantity,coin_id) value (56,50,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (56,'https://thumbs.dreamstime.com/b/tools-workshop-old-to-tinker-suspended-32376689.jpg','Ferramentas de funileiro',
'Conjunto de ferramentas de funileiro. Inclui
uma variedade de ferramentas manuais, linha, agulhas,
uma pedra de amolar, trapos de tecido e couro e um
pequeno frasco de cola.',
5,56,1,0,0,0);
insert into tb_tool(id,category_id) values(56,35);   


/*--Ferramenta de joalheiro--*/
insert into tb_cost(id,quantity,coin_id) value (57,25,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (57,'https://i.pinimg.com/564x/8e/5c/23/8e5c23673a254bd9b80b6c02a757d081.jpg','Ferramentas de joalheiro',
'Conjunto de ferramentas de joalheiro. Contém uma pequena serra, martelo, lixas, alicates e pinças.',
1,57,1,0,0,0);
insert into tb_tool(id,category_id) values(57,35);  

/*--Ferramenta de oleiro--*/
insert into tb_cost(id,quantity,coin_id) value (58,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (58,'https://www.scarva.com/Images/Models/Full/1073.Jpg','Ferramentas de oleiro',
'Conjunto de ferramentas de oleiro, usadas para construção de objetos de cerâmica. Contém marcadores de cerâmica, raspador, reforço, uma faca, e
pinças.',
1.5,58,1,0,0,0);
insert into tb_tool(id,category_id) values(58,35);  

/*--Ferramenta de pedreiro--*/
insert into tb_cost(id,quantity,coin_id) value (59,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (59,'https://i.pinimg.com/originals/74/1a/d5/741ad5113b1bd1d4c483f4926f867277.jpg','Ferramentas de pedreiro',
'Conjunto de ferramentas de pedreiro. Contém uma espátula, um martelo, um formão, broxa e um
esquadro .',
5,59,1,0,0,0);
insert into tb_tool(id,category_id) values(59,35);  

/*--Ferramenta de pintor--*/
insert into tb_cost(id,quantity,coin_id) value (60,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (60,'https://images.ctfassets.net/qjx9xgp99sha/3fDA1KagTg4jVPDmaK50hc/1ea8643e3d89cdf53da458cd49f205aa/Supplies_to_Paint_a_Room_Hero_1.jpg?fm=jpg&fl=progressive&w=2000','Ferramentas de pintor',
'Conjunto de ferramentas de pedreiro.Contém um cavalete, folhas, tintas, pincéis, bastões de carvão e uma paleta.',
2.5,60,1,0,0,0);
insert into tb_tool(id,category_id) values(60,35); 

/*--Ferramenta de sapateiro--*/
insert into tb_cost(id,quantity,coin_id) value (61,5,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (61,'https://i.pinimg.com/originals/6f/b0/3f/6fb03fdc9d965f026c294bafc5a3980b.jpg','Ferramentas de sapateiro',
'Conjunto de ferramentas de pedreiro.Contém um martelo, um furador, uma faca, um suporte para sapato, um cortador, couro para reposição e fios .',
2.5,61,1,0,0,0);
insert into tb_tool(id,category_id) values(61,35); 

/*--Ferramenta de vidreiro--*/
insert into tb_cost(id,quantity,coin_id) value (62,30,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (62,'https://i.pinimg.com/originals/6f/b0/3f/6fb03fdc9d965f026c294bafc5a3980b.jpg','Ferramentas de vidreiro',
'Conjunto de ferramentas de vidreiro. Contém um soprador, uma pequena placa de grafite, blocos e pinças. Você
precisa de uma fonte de calor para trabalhar o vidro .',
2.5,62,1,0,0,0);
insert into tb_tool(id,category_id) values(62,35);  

/*--Suprimento de alquimista--*/
insert into tb_cost(id,quantity,coin_id) value (63,50,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (63,'https://i.pinimg.com/564x/a9/0a/07/a90a07940f57083ae0df486995378714.jpg','Suprimentos de alquimista',
'Conjunto de ferramentas de alquimista. Contém dois copos de vidro, um suporte de metal para segurar
o copo sobre uma chama, uma vareta de vidro, um
pequeno almofariz e uma bolsa com ingredientes.
alquímicos comuns, inclumdo sal, ferro em po e agua
purificada.',
4,63,1,0,0,0);
insert into tb_tool(id,category_id) values(63,35);  

/*--Suprimentos de cervejeiro--*/
insert into tb_cost(id,quantity,coin_id) value (64,20,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (64,'https://i0.wp.com/critgames.com/wp-content/uploads/2016/06/beer_mug.png?resize=640%2C500','Suprimentos de cervejeiro',
'Conjunto de ferramentas de cervejeiro. Contém um grande jarro de vidro, uma quantidade de lupulo,
um sifão e vários metros de tubulação.',
4.5,64,1,0,0,0);
insert into tb_tool(id,category_id) values(64,35);  

/*--Suprimentos de caligrafia--*/
insert into tb_cost(id,quantity,coin_id) value (65,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (65,'https://64.media.tumblr.com/de6822fae108ad6c8a6e59e76f026b21/tumblr_inline_oa6ig5zDG91qdq19t_1280.png','Suprimentos de caligrafia',
'Conjunto de ferramentas de caligrafia. Contém tinta, uma dúzia de folhas de pergaminho e três penas.',
2.5,65,1,0,0,0);
insert into tb_tool(id,category_id) values(65,35);  

/*--Utensilios de cozinheiro--*/
insert into tb_cost(id,quantity,coin_id) value (66,1,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (66,'https://i.kinja-img.com/gawker-media/image/upload/c_scale,f_auto,fl_progressive,pg_1,q_80,w_800/hjojjieeiwrxm2ssayqn.jpg','Utensílios de cozinheiro',
'Conjunto de ferramentas de cozinheiro. Contém um
pote de metal, facas, garfos, uma colher para misturar
e uma concha.',
4,66,1,0,0,0);
insert into tb_tool(id,category_id) values(66,35);    

/*--Ferramentas de Navegação--*/
insert into tb_cost(id,quantity,coin_id) value (67,25,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (67,'https://i.pinimg.com/originals/58/80/ac/5880acd737812466997b52bcd78ad763.png','Ferramentas de navegação',
'Conjunto de ferramentas de navegação. Contém um sextante , um compasso, pinças , uma régua,
pergaminhos , tinta e uma pena.',
1,67,1,0,0,0);
insert into tb_tool(id,category_id) values(67,36);

/*--Ferramentas de ladrão--*/
insert into tb_cost(id,quantity,coin_id) value (68,25,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (68,'https://i.pinimg.com/564x/c4/e9/5d/c4e95d3236da2f5c0aea361925f423c4.jpg','Ferramentas de ladrão',
'Conjunto de ferramentas de ladrão. Contém uma
pequena lixa, um conjunto de gazuas, um pequeno
espelho em um suporte de metal, um conjunto de
tesouras de lâmina estreita e um par de alicates.',
0.5,68,1,0,0,0);
insert into tb_tool(id,category_id) values(68,37);  

/*--Alaúde--*/
insert into tb_cost(id,quantity,coin_id) value (69,35,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (69,'https://i.pinimg.com/564x/fc/04/d8/fc04d833973b7b3da55aba7579255d2a.jpg','Alaúde',
'O alaúde é um instrumento musical da família dos cordofones. Este instrumento é de corda palhetada ou dedilhada, com braço trastejado e com a sua característica caixa em forma de meia pêra ou gota. A origem das palavras alaúde e oud possivelmente remontam da palavra árabe al ud, a madeira".',
1,69,1,0,0,0);
insert into tb_tool(id,category_id) values(69,38); 

/*--Flauta--*/
insert into tb_cost(id,quantity,coin_id) value (70,2,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (70,'https://i.pinimg.com/564x/48/57/3c/48573cbe19314a7caa72e4c84ee0b1e8.jpg','Flauta',
'A flauta é o instrumento instrumento musical de sopro feito de diversos tipos de madeiras com formato de um tubo oco com orifícios. É um aerofone que, a partir do fluxo de ar dirigido a uma aresta que vibra com a passagem do ar, emite som.',
0.5,70,1,0,0,0);
insert into tb_tool(id,category_id) values(70,38); 

/*--Flauta de pã--*/
insert into tb_cost(id,quantity,coin_id) value (71,12,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (71,'https://i.pinimg.com/564x/da/f1/14/daf114139c9c00254df4b0e689c97674.jpg','Flauta de pã',
'A flauta de pã ou flauta de pan é um instrumento musical, e o nome genérico dado a instrumentos musicais constituídos por um conjunto de tubos fechados numa extremidade, ligados uns aos outros em feixe ou lado a lado.',
1,71,1,0,0,0);
insert into tb_tool(id,category_id) values(71,38);    

/*--Gaita de fole--*/
insert into tb_cost(id,quantity,coin_id) value (72,30,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (72,'https://i.pinimg.com/564x/9f/18/4f/9f184f0c72acd0ea888bed13562c4e6d.jpg','Gaita de fole',
'Gaita de fole é um instrumento da família dos aerofones, composto de pelo menos um tubo melódico e dum insuflador mediado por uma válvula, ambos ligados a um reservatório de ar; na maioria dos casos, há pelo menos mais um tubo melódico, pelo qual se emite uma nota pedal constante em harmonia com o tubo melódico.',
3,72,1,0,0,0);
insert into tb_tool(id,category_id) values(72,38);   

/*--Lira--*/
insert into tb_cost(id,quantity,coin_id) value (73,30,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (73,'https://i.pinimg.com/564x/0d/c3/d7/0dc3d7bad466686a2cfc528b21f73905.jpg','Lira',
'A lira é um instrumento de cordas conhecido pela sua vasta utilização durante a antiguidade. As récitas poéticas dos antigos gregos eram acompanhados pelo seu som, ainda que o instrumento não tivesse origem helênica.',
1,73,1,0,0,0);
insert into tb_tool(id,category_id) values(73,38);  

/*--Oboé--*/
insert into tb_cost(id,quantity,coin_id) value (74,2,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (74,'https://i.pinimg.com/564x/6a/7d/60/6a7d6053519b4993cc1ced05e9794724.jpg','Oboé',
'O oboé é um instrumento musical de sopro, classificado como um aerofone, membro da família das madeiras. Este instrumento contém uma palheta dupla. A família das madeiras inclui também as flautas, clarinetes, fagotes, saxofones, entre outros, sendo que oboés e fagotes possuem palhetas duplas.',
0.5,74,1,0,0,0);
insert into tb_tool(id,category_id) values(74,38); 

/*--Tambor--*/
insert into tb_cost(id,quantity,coin_id) value (75,6,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (75,'https://i.pinimg.com/564x/5c/ca/67/5cca67a273943d513a379d6e15bc6732.jpg','Tambor',
'Tambor é o nome genérico atribuído a vários instrumentos musicais do tipo membranofone, consistindo de uma membrana esticada percutida. Essa membrana pode estar montada em vários suportes: sobre uma armação, sem caixa de ressonância — pandeiro, adufe, etc.',
1.5,75,1,0,0,0);
insert into tb_tool(id,category_id) values(75,38);    

/*--Trombeta--*/
insert into tb_cost(id,quantity,coin_id) value (76,3,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (76,'https://i.stack.imgur.com/fkg0cm.jpg','Trombeta',
'O trompete é um instrumento musical de sopro, da família dos metais, caracterizado por instrumentos de bocal, geralmente fabricados de metal. Também faz parte o pistão é o sítio onde os trompetistas carregam para fazer um derivado de sons com o mesmo. Quem toca o trompete é chamado de trompetista.',
1,76,1,0,0,0);
insert into tb_tool(id,category_id) values(76,38);     

/*--Violino--*/
insert into tb_cost(id,quantity,coin_id) value (77,30,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (77,'https://i.pinimg.com/236x/87/3f/4a/873f4aacdb2af5d8a6a6f72e75b6944d.jpg','Violino',
'O violino é um instrumento musical, classificado como instrumento de cordas friccionadas. Foi inventado por Gasparo de Salò, um italiano que viveu entre os anos 1540 e 1609. O termo "violino" foi introduzido na língua portuguesa no século XX.',
3,77,1,0,0,0);
insert into tb_tool(id,category_id) values(77,38);

/*--Xilofone--*/
insert into tb_cost(id,quantity,coin_id) value (78,25,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (78,'https://i.pinimg.com/564x/7c/1a/60/7c1a602f4bdc2bab653ec2a847f1bbcf.jpg','Xilofone',
'Xilofone é o nome genérico para vários instrumentos musicais, mais precisamente idiofones percutidos, que consistem em várias lâminas de madeira dispostas cromaticamente. Entre os instrumentos que se podem considerar como xilofones temos o xilofone, a marimba, o balafon, etc.',
5,78,1,0,0,0);
insert into tb_tool(id,category_id) values(78,38); 

/*--Kit de disfarce--*/
insert into tb_cost(id,quantity,coin_id) value (79,25,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (79,'https://i.pinimg.com/564x/13/aa/0f/13aa0f32bb7e2a462871f456498160fa.jpg','Kit de disfarce',
'Essa bolsa de cosméticos, tintura de cabelo e pequenos adereços permite criar disfarces que mudam sua aparência física. Proficiência com este kit permite adicionar o bônus de proficiência para quaisquer testes de habilidade que você fizer para criar um disfarce visual.',
1.5,79,1,0,0,0);
insert into tb_tool(id,category_id) values(79,39);     

/*--Kit de falsificação--*/
insert into tb_cost(id,quantity,coin_id) value (80,15,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (80,'https://i.pinimg.com/originals/b7/76/40/b77640167d314713ab2c78319192fc50.png','Kit de falsificação',
'Essa pequena caixa contém uma variedade de papéis e pergaminhos, canetas e tintas, selos e lacres, folha de ouro e prata, e outros suprimentos necessários para criar falsificações convincentes de documentos físicos. Proficiência com esse kit permite adicionar o bônus de proficiência para quaisquer testes de habilidade que você fizer para criar uma falsificação de um documento físico.',
2.5,80,1,0,0,0);
insert into tb_tool(id,category_id) values(80,40);   

/*--Kit de herbalismo--*/
insert into tb_cost(id,quantity,coin_id) value (81,5,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (81,'https://i.pinimg.com/564x/fc/b9/48/fcb948646ec7d113759f11bc54c82b43.jpg','Kit de herbalismo',
'Esse kit contém uma variedade de instrumentos, como alicates, almofariz e pilão, e bolsas e frascos utilizados pelos herbalistas para criar remédios e poções. Proficiência com este kit permite adicionar o bônus de proficiência para quaisquer testes de habilidade que você fizer para identificar ou aplicar ervas. Além disso, a proficiência com esse kit é necessária para criar antídotos e poções de cura.',
1.5,81,1,0,0,0);
insert into tb_tool(id,category_id) values(81,41); 

/*--Baralho de cartas--*/
insert into tb_cost(id,quantity,coin_id) value (82,5,4);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (82,'https://i.pinimg.com/564x/43/4a/ee/434aee12d9080688a91b803f920920b9.jpg','Baralho de cartas',
'Baralho de cartas padrão com 52 cartas.',
0,82,1,0,0,0);
insert into tb_tool(id,category_id) values(82,42); 

/*--Conjunto de dados--*/
insert into tb_cost(id,quantity,coin_id) value (83,1,4);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (83,'https://www.replik-shop.de/images/product_images/popup_images/1341_3.jpg','Conjunto de dados',
'Conjunto de dados contendo 7 dados de 6 faces.',
0,83,1,0,0,0);
insert into tb_tool(id,category_id) values(83,42);

/*--Kit de venenos--*/
insert into tb_cost(id,quantity,coin_id) value (84,50,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (84,'https://i.pinimg.com/originals/35/83/6b/35836bf8b62fd80d88d09fbad9d6e708.jpg','Kit de venenos',
'O kit de venenos inclui os frascos, produtos químicos e outros equipamentos necessários para a criação de venenos. Proficiência com esse kit permite adicionar o bônus de proficiência para quaisquer testes de habilidade que você fizer para criar ou utilizar venenos.',
1,84,1,0,0,0);
insert into tb_tool(id,category_id) values(84,43);  