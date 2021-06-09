insert into movie (id, name, release_date) VALUES (nextval('movie_id_seq'), 'La cité de la peur', '01-06-1994'),
                                                  (nextval('movie_id_seq'), 'Dikkenek', '04-05-2005');

insert into character (id, name, movie_id) VALUES (nextval('character_id_seq'), 'Simon Jérémie', 1),
                                                  (nextval('character_id_seq'), 'Serge Karamazof', 1),
                                                  (nextval('character_id_seq'), 'Odile de Ray', 1),
                                                  (nextval('character_id_seq'), 'Claudie Fauquant', 2);

insert into quote (id, content_quote, character_id) values (nextval('quote_id_seq'), 'Il fallait que j''en prende ?', 1),
                                                           (nextval('quote_id_seq'), 'Aucun lien je suis fils unique', 2),
                                                           (nextval('quote_id_seq'), 'Skoll ofen stru', 3),
                                                           (nextval('quote_id_seq'), 'Tu sors ou je te sors', 4);