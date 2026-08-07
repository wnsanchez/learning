# INSTALACIÓN ARCHLINUX

## PRIMERA PARTE
## 1. Verificar conexión a Internet
```bash
ping -c 1 8.8.8.8
```

### 2. Definir particiones
```bash
# Entrar
cfdisk

```
Dividir el `Free Space`
  * Tamaño: `512M`
  * Tamaño: `TOTAL - 4.5G`
  * Tamaño: `4.5G` -> Seleccionar type `Linux Swap/ Solaris` 

### 3. Revisar particiones
```bash
lsblk
```

### 4. Formatear particiones

Formateo de sda1
```bash
mkfs.vfat -F 32 /dev/sda1
```
Formateo de sd2
```bash
mkfs.ext4 /dev/sda2
```
Formateo de sd3
```bash
mkswap /dev/sda3
# Activar partición  
swapon
```

### 5. Montaje
```bash
mount /dev/sda2 /mnt
# Crar una carpeta en MNT
mkdir /mnt/boot 
# Montar sda2
mount /dev/sda1 /mnt/boot
```

### 6. Descargar paquetes
```bash
pacstrap /mnt linux linux-firmware networkmanager grub wpa_supplicant base base-devel
```

### 7. Definir montaje
```bash
genfstab -U /mnt > /mnt > /mnt/etc/fstab

# Verificar
cat !$
```

### 8.  Entrar a nuestro entorno
```bash
arch-chroot /mnt
```


## SEGUNDA PARTE
### 1. Asignar contraseñar a root
```bash
passwd
```

### 2. Creación de usuario
```bash
useradd -m usuario
# Agregar a grupo
usermod -aG wheel
# Revisar grupos
groups usuario
# Asignar contraseña
passwd usuario
```

### 3. Agregar y editar `sudoers`
```bash
pacman -S sudo 
# Instalar nano / vim
pacman -S vim nano
# Editar sudoers
nano sudoers
```

Eliminar comentario de:
```bash
# Quitar #
```


### 4. Editar región
```bash
nano /etc/locale-gen
```
Descomentamos:
  ```bash
  es_PE.UTF-8 UTF-8
  es_PE ISO-8859-1   
  ```

Generar las localizaciones
```bash
locate-gen
```

### 5. Teclado
```bash
nano /etc/vconsole.conf
```
Agregar contenido
```text
KEYMAP=la-latin1
```

> Al reiniciar se verán los cambios

Verificar
```bash
localectl status
```

## TERCERA PARTE

### 1. Instalar GRUB
```bash
grub-install /dev/sda
```
Instala el gestor de arranque GRUB en el MBR (MAster Boot Record) del disco duro `/dev/sda`.


### 2. Archivo GRUB

```bash
grub-mkconfig -o /boot/grub/grub.cfg
```
Genera el archivo de configuración principal de GRUB, que se utiliza al arrancar el sistema.

### 3. Agregar hostname
```bash
echo nombre_host > /etc/hostname
# VErificar 
cat /etc/hostname
```

### 4. Editar `/etc/hosts`
```bash
nano /etc/hosts
```
Agregar:
```bash
127.0.0.1       localhost
::1             localhost
127.0.0.1       nombre_host.localhost nombre_host
```

### 5. Ver Info
```bash
pacman -S fastfetch
```
Es una alternativa moderna, más rápida y activamente mantenida que imita el estilo de `neofetch`. 

Para que se vea como `neofetch`, ejecuta:
```bash
fastfech --config neofetch
```

### 6. Reiniciar
```bash
exit
# Reiniciar ahora
reboot now
```

## CUARTA PARTE 
### 1. Activar `NetworkManager` y 
```bash
sudo systemctl start NetworManager.service
# Activar enable
sudo systemctl enable NetworkManager
#
sudo systemctl start wpa_supplicant.service
# Activar enable
sudo systemctl enable wpa_supplicant.service

# verificar 
ping -c 1 8.8.8.8
```

### 2. Agregar AUR
```bash
# Descargar git
pacman -S git

# Crear carpetas dentro home de usuario
mkdir -p Desktop/user_name/repos
cd Desktop/user_name/repos

# Clonar con git
git clone https://aur.archlinux.org/paru-bin.git

# Ingresar 
cd /paru-bin

# Usar
makepkg -si
```

### 3. Black Arch 
Herramientas de pentesting
```bash
# Regresar 
cd .. # ../repos
# Crear carpeta 
mkdir blackarch
# Entrar
cd !$

# Descargar 
curl -O https://blackarch.org/strap.sh

# Permisos de ejecución
chmod +x strap.sh

# Ejecutar como root
./strap.sh

# Actualizar 
pacman -Sy

# Buscar herramientas
pacman -Sgg


## Instalar 
pacman -S herramienta

# Descargar grupo
pacman -Sgg # Ver grupos disponibles
pacman -S nombre_grupo
```


### 4. GUI

```bash
pacman -S xorg xorg-server j
```
Instalación de gnome:
```bash
pacman -S gnome
```
Comprobar si esta:
```bash
pacman -Q gdm
```
Iniciar y habilitar
```bash
systemctl start gdm.service
# Salir de modo gráfico: ctrl + alt + F2

sudo systemctl enable gdm.service
```

### 5. Kitty
```bash
pacman -S kitty
reboot now
```

## QUINTA PARTE
### 1. Instalar `gtkmm`
```bash
# Actualizar
```bash
pacman -Syu
```

# Buscar paquete
```bash
pacman -Ss gtkmm 
```

### 2. VmWare
```bash
# Descargar
pacman -S mesa open-vm-tools
```

# Habilitar servicio
```bash
systemctl enable vmtoolsd
systemctl start vmtoolsd
reboot now
```






