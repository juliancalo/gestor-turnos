# 📅 Turnos Online

Sistema web para la gestión de turnos online adaptable a múltiples rubros (peluquerías, consultorios, centros de estética, etc). Cada local puede definir sus propios servicios, profesionales y disponibilidad horaria.

---

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- Maven

---

## 🧩 Estructura general

El sistema permite que distintos locales se registren y gestionen sus turnos, servicios y profesionales. Los usuarios pueden reservar turnos de forma rápida según disponibilidad.

### 🔑 Roles

- `CLIENTE`: puede registrarse y solicitar turnos.
- `ADMIN_LOCAL`: administra su local, servicios y agenda.
- `ADMIN_SISTEMA`: rol de gestión general (opcional).

### 🧱 Entidades principales

- **Usuario**: clientes y administradores
- **Local**: negocio individual (peluquería, consultorio, etc.)
- **Servicio**: ofrecido por un local (ej: corte de pelo, consulta médica)
- **Profesional**: quien brinda el servicio
- **Turno**: reserva con fecha, hora y servicio

---

## ⚙️ Configuración inicial

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/turnos-online.git

2. Crear la base de datos en MySQL:
   ```bash
   CREATE DATABASE turnosdb;

3. Configurar el archivo `application.properties`:
   ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/turnosdb
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

4. Ejecutar la aplicación:
   ```bash
   mvn spring-boot:run


🛣️ Proximas funcionalidades
- Autenticación con JWT
- Frontend web (React)
- Notificaciones por email / WhatsApp
- Panel de administración por local
- Filtros por fechas y profesionales

👥 Autores
- Alejandro Aguirre
- Julian Calo

📝 Licencia
Este proyecto es de uso libre para fines educativos o comerciales.
Si vas a usarlo públicamente, mencioná a los autores. 🙌