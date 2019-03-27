insert into usr (id, username, password, active)
      values (1,'admin','$2a$08$HzZyrB/3q.iWaGLDeOB6fe1NTiExnRBmmzwIehFNSHJAitQ0EPiQ6',true);

insert into user_role (user_id, roles)
      values (1,'USER'), (1,'ADMIN');
