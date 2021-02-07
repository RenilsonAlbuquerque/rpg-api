use rpg2;

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
values (4,'https://static.wikia.nocookie.net/kaldaarpedia/images/1/13/Greatclub.jpg/revision/latest/scale-to-width-down/340?cb=20130707013459','Clava grande',
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
values (6,'https://static.wikia.nocookie.net/dnd4/images/d/d0/Boar-spear-95boask-full-1.jpg/revision/latest/scale-to-width-down/340?cb=20150119133620','Lança',
' é qualquer arma feita com uma haste de madeira e ponta afiada, natural ou metálica. Por sua facilidade de fabricação, é muito comum entre diversas raças menos civilizadas. Uma lança também pode ser arremessada.',
1.5,6,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (6,0,13,1,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (6,2,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (6,7);

/*--Maça--*/
insert into tb_cost(id,quantity,coin_id) value (7,5,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (7,'https://static.wikia.nocookie.net/dnd4/images/2/2b/Enchanted-mace.jpg/revision/latest/scale-to-width-down/340?cb=20150119130755','Maça',
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
values (17,'https://static.wikia.nocookie.net/dnd4/images/0/09/Whip_Collectors_-_Johnny_Cadell.jpg/revision/latest/scale-to-width-down/340?cb=20150119163545','Chicote',
'Você pode atacar um inimigo a até 4,5m com um chicote. Esta arma pode se enroscar na mãos, pernas ou armas do adversário; você recebe +4 em jogadas de ataque para derrubar ou desarmar. O talento Acuidade com Arma se aplica ao chicote.',
1.5,16,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (17,0,19,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (17,1,3,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (17,1);
insert into mtm_weapon_property(weapon_id,property_id) values (17,2);


/*--Espada Curta--*/
insert into tb_cost(id,quantity,coin_id) value (18,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (18,'https://static.wikia.nocookie.net/dnd4/images/4/4b/Shortsword.gif/revision/latest?cb=20150119143937','Espada curta',
'É o mais comum tipo de espada, muito usada por milicianos e soldados rasos - ou ainda como arma secundária. Possui entre 40 a 50 cm de comprimento',
1,18,1,0,0,0);
insert into tb_weapon(id,bonus,category_id,classification_id,range_id) values (18,0,7,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (18,2,9,0,1);
insert into mtm_weapon_property(weapon_id,property_id) values (18,1);
insert into mtm_weapon_property(weapon_id,property_id) values (18,7);

/*--Espada Grande--*/
insert into tb_cost(id,quantity,coin_id) value (19,50,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (19,'https://br.pinterest.com/pin/820499625839559977/','Espada grande',
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
values (30,'https://static.wikia.nocookie.net/dnd4/images/b/b1/%24_59.JPG/revision/latest?cb=20150119145625','Picareta de guerra',
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
values (37,'https://static.wikia.nocookie.net/chroniclesofarn/images/7/7b/Armor-padded-01.png/revision/latest/scale-to-width-down/340?cb=20121223145727','Armadura Acolchoada',
'Composta por várias camadas de tecido sobrepostas. É a armadura mais leve, mas também é a que oferece menos proteção.',
4,36,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (37,11,10,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(37,0,0,true,31,37);

/*--Armadura de couro--*/
insert into tb_cost(id,quantity,coin_id) value (38,10,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (38,'https://i.dlpng.com/static/png/4721833-armor-leather-01-leather-armor-free-transparent-png-download-armor-png-820_983_preview.png','Armadura de couro',
'o peitoral desta armadura é feito de couro curtido em óleo fervente, para ficar mais rígido, enquanto as demais partes são feitas de couro flexível.',
5,38,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (38,11,10,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(38,0,0,false,31,38);

/*--Armadura de couro batido--*/
insert into tb_cost(id,quantity,coin_id) value (39,45,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (39,'https://static.wikia.nocookie.net/emerald-isles/images/c/c3/Simple-Studded-Leather-Armour.png/revision/latest?cb=20180506015511','Armadura de couro batido',
'Versão mais pesada do corselete de couro, reforçada com rebites de metal.',
6,39,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (39,12,10,2);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(39,0,0,false,31,39);


/*--Gibão de peles--*/
insert into tb_cost(id,quantity,coin_id) value (40,15,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id,magic,deleted,confidential)
values (40,'https://static.wikia.nocookie.net/forgottenrealms/images/0/0a/Hide.jpg/revision/latest?cb=20151019005254','Gibão de peles',
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
values (42,'https://static.wikia.nocookie.net/bouldersandbarbarians/images/5/59/Scalemail.png/revision/latest?cb=20181120153951','Brunea',
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
values (47,'https://static.wikia.nocookie.net/forgottenrealms/images/d/d2/SplintMail4e.png/revision/latest?cb=20200528161256','Cota de talas',
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
values (49,'https://static.wikia.nocookie.net/emerald-isles/images/d/dd/Shield_Wooden_Light.png/revision/latest?cb=20180506230512','Escudo',
'Esse escudo de aço é preso ao antebraço e também deve ser empunhado com firmeza, impedindo o usuário de usar aquela mão.',
3,49,1,0,0,0);
insert into tb_armor_armor_class(id,armor_class_base,max_value,armor_atribute_id) value (49,2,0,null);
insert into tb_armor(id,ac_bonus,min_strength,stealth_disadvantage,category_id,armor_class_id) 
values(49,0,0,false,34,49);
/*========================

insert into tb_cost(id,quantity,coin_id) value (2,350000,2);
insert into tb_equipament(id,image_path,name,description,weight,cost_id,rarity_id)
values (2,'https://media-waterdeep.cursecdn.com/avatars/thumbnails/7/253/1000/1000/636284739956618526.jpeg',
'Vingadora sagrada','Um tipo raro de espada forjada para combater o mal em todas as suas formas, almejada por paladinos de todos os reinos
.Possui magnificos poderes que apenas se mostram nas mãos de um guerreiro benevolente',1.5,2,5);
insert into tb_weapon(bonus,id,category_id,classification_id,range_id) values (3,2,6,2,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (2,3,11,0,1);
insert into mtm_weapon_dice(weapon_id,dice_id,damage_type_id,bonus,quantity) values (2,4,11,0,1);
*/
   

    