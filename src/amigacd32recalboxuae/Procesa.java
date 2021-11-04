/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amigacd32recalboxuae;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author djvat
 */
public class Procesa {
    private String rutacues;
    private String carpeta;

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }
    
    public String getRutacues() {
        return rutacues;
    }

    public void setRutacues(String rutacues) {
        this.rutacues = rutacues;
    }

   public Procesa()
   {
       
   }
    
    public void haz() {
        File folder = new File(rutacues);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {

                if (escue(listOfFiles[i].getName())) {
                    System.out.println(listOfFiles[i].getName());
                    creauae(quitaextension(listOfFiles[i].getAbsolutePath()), listOfFiles[i].getName());
                    creauaecd32(quitaextension(listOfFiles[i].getAbsolutePath()), listOfFiles[i].getName());

                }
            } else if (listOfFiles[i].isDirectory()) {

            }
        }
        System.out.println("Hecho.");
        JOptionPane.showMessageDialog(null, "Hecho", "Alerta " + "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }

      private static String quitaextension(String nombre) {
        String resultado = "";
        int cont = nombre.length() - 1;
        boolean sal = false;
        boolean copia = false;
        while (!sal) {
            if (cont >= 0) {
                if (copia) {
                    resultado = nombre.charAt(cont) + resultado;

                } else {
                    if (nombre.charAt(cont) == '.') {
                        copia = true;
                    }
                }
                cont--;
            } else {
                sal = true;
            }
        }
        return resultado;
    }

    private static boolean escue(String nombre) {
        if (nombre.endsWith(".cue")) {
            return true;
        } else {
            return false;
        }
    }

    private void creauae(String cue, String nombre) {
        BufferedWriter writer = null;
        try {

            File logFile = new File(cue + ".uae");
            System.out.println(cue + ".uae");
            writer = new BufferedWriter(new FileWriter(logFile));
            writer.write("config_description=UAE default configuration\n" +
"config_hardware=true\n" +
"config_host=true\n" +
"config_version=2.8.1\n" +
"pandora.blitter_in_partial_mode=0\n" +
"pandora.joy_conf=0\n" +
"pandora.joy_port=0\n" +
"pandora.stylus_offset=0\n" +
"pandora.custom_dpad=1\n" +
"pandora.button1=2\n" +
"pandora.button2=1\n" +
"pandora.autofire_button=3\n" +
"pandora.jump=-1\n" +
"use_debugger=false\n" +
"floppy0sound=0\n" +
"floppy1sound=0\n" +
"floppy2sound=0\n" +
"floppy3sound=0\n" +
"floppy_volume=0\n" +
"scsi=false\n" +
"sound_volume=0\n" +
"sound_auto=yes\n" +
"gfx_refreshrate=0\n" +
"gfx_vsync=true\n" +
"gfx_center_horizontal=none\n" +
"gfx_center_vertical=none\n" +
"a1000ram=false\n" +
"rtg_nocustom=true\n" +
"kickstart_rom_file_id=C4F0F55F,KS ROM v1.3 (A500,A1000,A2000)\n" +
"pandora.rom_path=/recalbox/share_init/emulators/" + carpeta + "/kickstarts/\n" +
"pandora.floppy_path=/recalbox/share/roms/" + carpeta +"/\n" +
"pandora.hardfile_path=/recalbox/share/roms/" + carpeta + "/\n" +
"pandora.cd_path=/recalbox/share/roms/"+ carpeta +"/\n" +
"; host-specific\n" +
"pandora.cpu_speed=600\n" +
"pandora.hide_idle_led=0\n" +
"pandora.tap_delay=10\n" +
"pandora.custom_controls=0\n" +
"pandora.custom_up=0\n" +
"pandora.custom_down=0\n" +
"pandora.custom_left=0\n" +
"pandora.custom_right=0\n" +
"pandora.custom_a=0\n" +
"pandora.custom_b=0\n" +
"pandora.custom_x=0\n" +
"pandora.custom_y=0\n" +
"pandora.custom_l=0\n" +
"pandora.custom_r=0\n" +
"pandora.move_x=0\n" +
"pandora.move_y=0\n" +
"; common\n" +
"use_gui=no\n" +
"kickstart_rom_file=/recalbox/share/bios/KS31_CD32.rom\n" +
"kickstart_ext_rom_file=/recalbox/share/bios/EXT_CD32.rom\n" +
"cd_speed=100\n" +
"cd32cd=true\n" +
"cd32c2p=true\n" +
"cd32nvram=true\n" +
"cdimage0=$(FILE_PATH)/" + nombre + ",image\n" +
"flash_file=\n" +
"floppy0=\n" +
"floppy1=\n" +
"floppy1type=-1\n" +
"floppy2=\n" +
"floppy3=\n" +
"nr_floppies=1\n" +
"floppy_speed=100\n" +
"sound_output=exact\n" +
"sound_channels=stereo\n" +
"sound_stereo_separation=7\n" +
"sound_stereo_mixing_delay=0\n" +
"sound_frequency=44100\n" +
"sound_interpol=none\n" +
"sound_filter=off\n" +
"sound_filter_type=standard\n" +
"sound_volume_cd=20\n" +
"cachesize=0\n" +
"joyport0=mouse\n" +
"joyport0autofire=none\n" +
"joyportfriendlyname0=Nubs as mouse\n" +
"joyportname0=MOUSE0\n" +
"joyport1=joy1\n" +
"joyport1autofire=none\n" +
"joyport1mode=djoy\n" +
"joyportfriendlyname1=USB,2-axis 8-button gamepad  \n" +
"joyportname1=JOY1\n" +
"bsdsocket_emu=false\n" +
"synchronize_clock=true\n" +
"key_for_menu=293\n" +
"key_for_quit=0\n" +
"button_for_menu=-1\n" +
"button_for_quit=8\n" +
"gfx_framerate=0\n" +
"gfx_width=704\n" +
"gfx_height=280\n" +
"gfx_width_windowed=704\n" +
"gfx_height_windowed=280\n" +
"gfx_width_fullscreen=704\n" +
"gfx_height_fullscreen=280\n" +
"gfx_lores=true\n" +
"gfx_resolution=lores\n" +
"gfx_correct_aspect=0\n" +
"gfx_fullscreen_ratio=100\n" +
"kbd_led_num=-1\n" +
"kbd_led_scr=-1\n" +
"kbd_led_cap=-1\n" +
"immediate_blits=false\n" +
"waiting_blits=automatic\n" +
"fast_copper=false\n" +
"ntsc=false\n" +
"chipset=aga\n" +
"chipset_refreshrate=0.000000\n" +
"collision_level=playfields\n" +
"fastmem_size=8\n" +
"z3mem_size=0\n" +
"z3mem_start=0x1000000\n" +
"bogomem_size=0\n" +
"gfxcard_size=0\n" +
"gfxcard_type=ZorroIII\n" +
"chipmem_size=4\n" +
"cpu_speed=max\n" +
"cpu_type=68ec020\n" +
"cpu_model=68020\n" +
"cpu_compatible=false\n" +
"cpu_24bit_addressing=true\n" +
"rtg_modes=0x502\n" +
"input.config=0\n" +
"input.joymouse_speed_analog=2\n" +
"input.joymouse_speed_digital=10\n" +
"input.joymouse_deadzone=33\n" +
"input.joystick_deadzone=33\n" +
"input.analog_joystick_multiplier=15\n" +
"input.analog_joystick_offset=-1\n" +
"input.mouse_speed=25\n" +
"input.autofire_speed=0\n" +
"input.1.joystick.0.friendlyname=dPad as joystick\n" +
"input.1.joystick.0.name=JOY0\n" +
"input.1.joystick.0.empty=true\n" +
"input.1.joystick.0.disabled=false\n" +
"input.1.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n" +
"input.1.joystick.1.name=JOY1\n" +
"input.1.joystick.1.empty=true\n" +
"input.1.joystick.1.disabled=false\n" +
"input.1.joystick.2.empty=true\n" +
"input.1.joystick.2.disabled=false\n" +
"input.1.joystick.3.empty=true\n" +
"input.1.joystick.3.disabled=false\n" +
"input.1.joystick.4.empty=true\n" +
"input.1.joystick.4.disabled=false\n" +
"input.1.joystick.5.empty=true\n" +
"input.1.joystick.5.disabled=false\n" +
"input.1.joystick.6.empty=true\n" +
"input.1.joystick.6.disabled=false\n" +
"input.1.joystick.7.empty=true\n" +
"input.1.joystick.7.disabled=false\n" +
"input.1.mouse.0.friendlyname=Nubs as mouse\n" +
"input.1.mouse.0.name=MOUSE0\n" +
"input.1.mouse.0.empty=true\n" +
"input.1.mouse.0.disabled=false\n" +
"input.1.mouse.1.friendlyname=dPad as mouse\n" +
"input.1.mouse.1.name=MOUSE1\n" +
"input.1.mouse.1.empty=true\n" +
"input.1.mouse.1.disabled=false\n" +
"input.1.mouse.2.empty=true\n" +
"input.1.mouse.2.disabled=false\n" +
"input.1.mouse.3.empty=true\n" +
"input.1.mouse.3.disabled=false\n" +
"input.1.mouse.4.empty=true\n" +
"input.1.mouse.4.disabled=false\n" +
"input.1.mouse.5.empty=true\n" +
"input.1.mouse.5.disabled=false\n" +
"input.1.mouse.6.empty=true\n" +
"input.1.mouse.6.disabled=false\n" +
"input.1.mouse.7.empty=true\n" +
"input.1.mouse.7.disabled=false\n" +
"input.1.keyboard.0.friendlyname=Default Keyboard\n" +
"input.1.keyboard.0.name=KEYBOARD0\n" +
"input.1.keyboard.0.empty=false\n" +
"input.1.keyboard.0.disabled=false\n" +
"input.1.keyboard.1.empty=true\n" +
"input.1.keyboard.1.disabled=false\n" +
"input.1.keyboard.2.empty=true\n" +
"input.1.keyboard.2.disabled=false\n" +
"input.1.keyboard.3.empty=true\n" +
"input.1.keyboard.3.disabled=false\n" +
"input.1.keyboard.4.empty=true\n" +
"input.1.keyboard.4.disabled=false\n" +
"input.1.keyboard.5.empty=true\n" +
"input.1.keyboard.5.disabled=false\n" +
"input.1.keyboard.6.empty=true\n" +
"input.1.keyboard.6.disabled=false\n" +
"input.1.keyboard.7.empty=true\n" +
"input.1.keyboard.7.disabled=false\n" +
"input.2.joystick.0.friendlyname=dPad as joystick\n" +
"input.2.joystick.0.name=JOY0\n" +
"input.2.joystick.0.empty=true\n" +
"input.2.joystick.0.disabled=false\n" +
"input.2.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n" +
"input.2.joystick.1.name=JOY1\n" +
"input.2.joystick.1.empty=true\n" +
"input.2.joystick.1.disabled=false\n" +
"input.2.joystick.2.empty=true\n" +
"input.2.joystick.2.disabled=false\n" +
"input.2.joystick.3.empty=true\n" +
"input.2.joystick.3.disabled=false\n" +
"input.2.joystick.4.empty=true\n" +
"input.2.joystick.4.disabled=false\n" +
"input.2.joystick.5.empty=true\n" +
"input.2.joystick.5.disabled=false\n" +
"input.2.joystick.6.empty=true\n" +
"input.2.joystick.6.disabled=false\n" +
"input.2.joystick.7.empty=true\n" +
"input.2.joystick.7.disabled=false\n" +
"input.2.mouse.0.friendlyname=Nubs as mouse\n" +
"input.2.mouse.0.name=MOUSE0\n" +
"input.2.mouse.0.empty=true\n" +
"input.2.mouse.0.disabled=false\n" +
"input.2.mouse.1.friendlyname=dPad as mouse\n" +
"input.2.mouse.1.name=MOUSE1\n" +
"input.2.mouse.1.empty=true\n" +
"input.2.mouse.1.disabled=false\n" +
"input.2.mouse.2.empty=true\n" +
"input.2.mouse.2.disabled=false\n" +
"input.2.mouse.3.empty=true\n" +
"input.2.mouse.3.disabled=false\n" +
"input.2.mouse.4.empty=true\n" +
"input.2.mouse.4.disabled=false\n" +
"input.2.mouse.5.empty=true\n" +
"input.2.mouse.5.disabled=false\n" +
"input.2.mouse.6.empty=true\n" +
"input.2.mouse.6.disabled=false\n" +
"input.2.mouse.7.empty=true\n" +
"input.2.mouse.7.disabled=false\n" +
"input.2.keyboard.0.friendlyname=Default Keyboard\n" +
"input.2.keyboard.0.name=KEYBOARD0\n" +
"input.2.keyboard.0.empty=false\n" +
"input.2.keyboard.0.disabled=false\n" +
"input.2.keyboard.1.empty=true\n" +
"input.2.keyboard.1.disabled=false\n" +
"input.2.keyboard.2.empty=true\n" +
"input.2.keyboard.2.disabled=false\n" +
"input.2.keyboard.3.empty=true\n" +
"input.2.keyboard.3.disabled=false\n" +
"input.2.keyboard.4.empty=true\n" +
"input.2.keyboard.4.disabled=false\n" +
"input.2.keyboard.5.empty=true\n" +
"input.2.keyboard.5.disabled=false\n" +
"input.2.keyboard.6.empty=true\n" +
"input.2.keyboard.6.disabled=false\n" +
"input.2.keyboard.7.empty=true\n" +
"input.2.keyboard.7.disabled=false\n" +
"input.3.joystick.0.friendlyname=dPad as joystick\n" +
"input.3.joystick.0.name=JOY0\n" +
"input.3.joystick.0.empty=true\n" +
"input.3.joystick.0.disabled=false\n" +
"input.3.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n" +
"input.3.joystick.1.name=JOY1\n" +
"input.3.joystick.1.empty=true\n" +
"input.3.joystick.1.disabled=false\n" +
"input.3.joystick.2.empty=true\n" +
"input.3.joystick.2.disabled=false\n" +
"input.3.joystick.3.empty=true\n" +
"input.3.joystick.3.disabled=false\n" +
"input.3.joystick.4.empty=true\n" +
"input.3.joystick.4.disabled=false\n" +
"input.3.joystick.5.empty=true\n" +
"input.3.joystick.5.disabled=false\n" +
"input.3.joystick.6.empty=true\n" +
"input.3.joystick.6.disabled=false\n" +
"input.3.joystick.7.empty=true\n" +
"input.3.joystick.7.disabled=false\n" +
"input.3.mouse.0.friendlyname=Nubs as mouse\n" +
"input.3.mouse.0.name=MOUSE0\n" +
"input.3.mouse.0.empty=true\n" +
"input.3.mouse.0.disabled=false\n" +
"input.3.mouse.1.friendlyname=dPad as mouse\n" +
"input.3.mouse.1.name=MOUSE1\n" +
"input.3.mouse.1.empty=true\n" +
"input.3.mouse.1.disabled=false\n" +
"input.3.mouse.2.empty=true\n" +
"input.3.mouse.2.disabled=false\n" +
"input.3.mouse.3.empty=true\n" +
"input.3.mouse.3.disabled=false\n" +
"input.3.mouse.4.empty=true\n" +
"input.3.mouse.4.disabled=false\n" +
"input.3.mouse.5.empty=true\n" +
"input.3.mouse.5.disabled=false\n" +
"input.3.mouse.6.empty=true\n" +
"input.3.mouse.6.disabled=false\n" +
"input.3.mouse.7.empty=true\n" +
"input.3.mouse.7.disabled=false\n" +
"input.3.keyboard.0.friendlyname=Default Keyboard\n" +
"input.3.keyboard.0.name=KEYBOARD0\n" +
"input.3.keyboard.0.empty=false\n" +
"input.3.keyboard.0.disabled=false\n" +
"input.3.keyboard.1.empty=true\n" +
"input.3.keyboard.1.disabled=false\n" +
"input.3.keyboard.2.empty=true\n" +
"input.3.keyboard.2.disabled=false\n" +
"input.3.keyboard.3.empty=true\n" +
"input.3.keyboard.3.disabled=false\n" +
"input.3.keyboard.4.empty=true\n" +
"input.3.keyboard.4.disabled=false\n" +
"input.3.keyboard.5.empty=true\n" +
"input.3.keyboard.5.disabled=false\n" +
"input.3.keyboard.6.empty=true\n" +
"input.3.keyboard.6.disabled=false\n" +
"input.3.keyboard.7.empty=true\n" +
"input.3.keyboard.7.disabled=false\n" +
"input.4.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n" +
"input.4.joystick.1.name=JOY1\n" +
"input.4.joystick.1.custom=true\n" +
"input.4.mouse.0.friendlyname=Nubs as mouse\n" +
"input.4.mouse.0.name=MOUSE0\n" +
"input.4.mouse.0.custom=true\n" +
"input.4.keyboard.0.friendlyname=Default Keyboard\n" +
"input.4.keyboard.0.name=KEYBOARD0\n" +
"input.4.keyboard.0.custom=true\n");
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                writer.close();
            } catch (Exception e) {
            }
        }
    }
    
     private void creauaecd32(String cue, String nombre) {
        BufferedWriter writer = null;
        try {

            File logFile = new File(cue + "cd32.uae");
            System.out.println(cue + "cd32.uae");
            writer = new BufferedWriter(new FileWriter(logFile));
            writer.write("config_description=UAE default configuration\n" +
"config_hardware=true\n" +
"config_host=true\n" +
"config_version=2.8.1\n" +
"pandora.blitter_in_partial_mode=0\n" +
"pandora.joy_conf=0\n" +
"pandora.joy_port=0\n" +
"pandora.stylus_offset=0\n" +
"pandora.custom_dpad=1\n" +
"pandora.button1=2\n" +
"pandora.button2=1\n" +
"pandora.autofire_button=3\n" +
"pandora.jump=-1\n" +
"use_debugger=false\n" +
"floppy0sound=0\n" +
"floppy1sound=0\n" +
"floppy2sound=0\n" +
"floppy3sound=0\n" +
"floppy_volume=0\n" +
"scsi=false\n" +
"sound_volume=0\n" +
"sound_auto=yes\n" +
"gfx_refreshrate=0\n" +
"gfx_vsync=true\n" +
"gfx_center_horizontal=none\n" +
"gfx_center_vertical=none\n" +
"a1000ram=false\n" +
"rtg_nocustom=true\n" +
"kickstart_rom_file_id=C4F0F55F,KS ROM v1.3 (A500,A1000,A2000)\n" +
"pandora.rom_path=/recalbox/share_init/emulators/amiga/kickstarts/\n" +
"pandora.floppy_path=/recalbox/share/roms/"+ carpeta +"/\n" +
"pandora.hardfile_path=/recalbox/share/roms/" + carpeta +"/\n" +
"pandora.cd_path=/recalbox/share/roms/"+carpeta+"/\n" +
"; host-specific\n" +
"pandora.cpu_speed=600\n" +
"pandora.hide_idle_led=0\n" +
"pandora.tap_delay=10\n" +
"pandora.custom_controls=0\n" +
"pandora.custom_up=0\n" +
"pandora.custom_down=0\n" +
"pandora.custom_left=0\n" +
"pandora.custom_right=0\n" +
"pandora.custom_a=0\n" +
"pandora.custom_b=0\n" +
"pandora.custom_x=0\n" +
"pandora.custom_y=0\n" +
"pandora.custom_l=0\n" +
"pandora.custom_r=0\n" +
"pandora.move_x=0\n" +
"pandora.move_y=0\n" +
"; common\n" +
"use_gui=no\n" +
"kickstart_rom_file=/recalbox/share/bios/KS31_CD32.rom\n" +
"kickstart_ext_rom_file=/recalbox/share/bios/EXT_CD32.rom\n" +
"cd_speed=100\n" +
"cd32cd=true\n" +
"cd32c2p=true\n" +
"cd32nvram=true\n" +
"cdimage0=$(FILE_PATH)/"+nombre+",image\n" +
"flash_file=\n" +
"floppy0=\n" +
"floppy1=\n" +
"floppy1type=-1\n" +
"floppy2=\n" +
"floppy3=\n" +
"nr_floppies=1\n" +
"floppy_speed=100\n" +
"sound_output=exact\n" +
"sound_channels=stereo\n" +
"sound_stereo_separation=7\n" +
"sound_stereo_mixing_delay=0\n" +
"sound_frequency=44100\n" +
"sound_interpol=none\n" +
"sound_filter=off\n" +
"sound_filter_type=standard\n" +
"sound_volume_cd=20\n" +
"cachesize=0\n" +
"joyport0=mouse\n" +
"joyport0autofire=none\n" +
"joyportfriendlyname0=Nubs as mouse\n" +
"joyportname0=MOUSE0\n" +
"joyport1=joy1\n" +
"joyport1autofire=none\n" +
"joyport1mode=cd32joy\n" +
"joyportfriendlyname1=USB,2-axis 8-button gamepad  \n" +
"joyportname1=JOY1\n" +
"joyport1_amiberry_custom_none_north=Joy2 CD32 Blue\n" +
"joyport1_amiberry_custom_none_east=Joy2 CD32 Green\n" +
"joyport1_amiberry_custom_none_south=Joy2 CD32 Red\n" +
"joyport1_amiberry_custom_none_west=Joy2 CD32 Yellow\n" +
"bsdsocket_emu=false\n" +
"synchronize_clock=true\n" +
"key_for_menu=293\n" +
"key_for_quit=0\n" +
"button_for_menu=-1\n" +
"button_for_quit=8\n" +
"gfx_framerate=0\n" +
"gfx_width=704\n" +
"gfx_height=280\n" +
"gfx_width_windowed=704\n" +
"gfx_height_windowed=280\n" +
"gfx_width_fullscreen=704\n" +
"gfx_height_fullscreen=280\n" +
"gfx_lores=true\n" +
"gfx_resolution=lores\n" +
"gfx_correct_aspect=0\n" +
"gfx_fullscreen_ratio=100\n" +
"kbd_led_num=-1\n" +
"kbd_led_scr=-1\n" +
"kbd_led_cap=-1\n" +
"immediate_blits=false\n" +
"waiting_blits=automatic\n" +
"fast_copper=false\n" +
"ntsc=false\n" +
"chipset=aga\n" +
"chipset_refreshrate=0.000000\n" +
"collision_level=playfields\n" +
"fastmem_size=8\n" +
"z3mem_size=0\n" +
"z3mem_start=0x1000000\n" +
"bogomem_size=0\n" +
"gfxcard_size=0\n" +
"gfxcard_type=ZorroIII\n" +
"chipmem_size=4\n" +
"cpu_speed=max\n" +
"cpu_type=68ec020\n" +
"cpu_model=68020\n" +
"cpu_compatible=false\n" +
"cpu_24bit_addressing=true\n" +
"rtg_modes=0x502\n" +
"input.config=0\n" +
"input.joymouse_speed_analog=2\n" +
"input.joymouse_speed_digital=10\n" +
"input.joymouse_deadzone=33\n" +
"input.joystick_deadzone=33\n" +
"input.analog_joystick_multiplier=15\n" +
"input.analog_joystick_offset=-1\n" +
"input.mouse_speed=25\n" +
"input.autofire_speed=0\n" +
"input.1.joystick.0.friendlyname=dPad as joystick\n" +
"input.1.joystick.0.name=JOY0\n" +
"input.1.joystick.0.empty=true\n" +
"input.1.joystick.0.disabled=false\n" +
"input.1.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n" +
"input.1.joystick.1.name=JOY1\n" +
"input.1.joystick.1.empty=true\n" +
"input.1.joystick.1.disabled=false\n" +
"input.1.joystick.2.empty=true\n" +
"input.1.joystick.2.disabled=false\n" +
"input.1.joystick.3.empty=true\n" +
"input.1.joystick.3.disabled=false\n" +
"input.1.joystick.4.empty=true\n" +
"input.1.joystick.4.disabled=false\n" +
"input.1.joystick.5.empty=true\n" +
"input.1.joystick.5.disabled=false\n" +
"input.1.joystick.6.empty=true\n" +
"input.1.joystick.6.disabled=false\n" +
"input.1.joystick.7.empty=true\n" +
"input.1.joystick.7.disabled=false\n" +
"input.1.mouse.0.friendlyname=Nubs as mouse\n" +
"input.1.mouse.0.name=MOUSE0\n" +
"input.1.mouse.0.empty=true\n" +
"input.1.mouse.0.disabled=false\n" +
"input.1.mouse.1.friendlyname=dPad as mouse\n" +
"input.1.mouse.1.name=MOUSE1\n" +
"input.1.mouse.1.empty=true\n" +
"input.1.mouse.1.disabled=false\n" +
"input.1.mouse.2.empty=true\n" +
"input.1.mouse.2.disabled=false\n" +
"input.1.mouse.3.empty=true\n" +
"input.1.mouse.3.disabled=false\n" +
"input.1.mouse.4.empty=true\n" +
"input.1.mouse.4.disabled=false\n" +
"input.1.mouse.5.empty=true\n" +
"input.1.mouse.5.disabled=false\n" +
"input.1.mouse.6.empty=true\n" +
"input.1.mouse.6.disabled=false\n" +
"input.1.mouse.7.empty=true\n" +
"input.1.mouse.7.disabled=false\n" +
"input.1.keyboard.0.friendlyname=Default Keyboard\n" +
"input.1.keyboard.0.name=KEYBOARD0\n" +
"input.1.keyboard.0.empty=false\n" +
"input.1.keyboard.0.disabled=false\n" +
"input.1.keyboard.1.empty=true\n" +
"input.1.keyboard.1.disabled=false\n" +
"input.1.keyboard.2.empty=true\n" +
"input.1.keyboard.2.disabled=false\n" +
"input.1.keyboard.3.empty=true\n" +
"input.1.keyboard.3.disabled=false\n" +
"input.1.keyboard.4.empty=true\n" +
"input.1.keyboard.4.disabled=false\n" +
"input.1.keyboard.5.empty=true\n" +
"input.1.keyboard.5.disabled=false\n" +
"input.1.keyboard.6.empty=true\n" +
"input.1.keyboard.6.disabled=false\n" +
"input.1.keyboard.7.empty=true\n" +
"input.1.keyboard.7.disabled=false\n" +
"input.2.joystick.0.friendlyname=dPad as joystick\n" +
"input.2.joystick.0.name=JOY0\n" +
"input.2.joystick.0.empty=true\n" +
"input.2.joystick.0.disabled=false\n" +
"input.2.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n" +
"input.2.joystick.1.name=JOY1\n" +
"input.2.joystick.1.empty=true\n" +
"input.2.joystick.1.disabled=false\n" +
"input.2.joystick.2.empty=true\n" +
"input.2.joystick.2.disabled=false\n" +
"input.2.joystick.3.empty=true\n" +
"input.2.joystick.3.disabled=false\n" +
"input.2.joystick.4.empty=true\n" +
"input.2.joystick.4.disabled=false\n" +
"input.2.joystick.5.empty=true\n" +
"input.2.joystick.5.disabled=false\n" +
"input.2.joystick.6.empty=true\n" +
"input.2.joystick.6.disabled=false\n" +
"input.2.joystick.7.empty=true\n" +
"input.2.joystick.7.disabled=false\n" +
"input.2.mouse.0.friendlyname=Nubs as mouse\n" +
"input.2.mouse.0.name=MOUSE0\n" +
"input.2.mouse.0.empty=true\n" +
"input.2.mouse.0.disabled=false\n" +
"input.2.mouse.1.friendlyname=dPad as mouse\n" +
"input.2.mouse.1.name=MOUSE1\n" +
"input.2.mouse.1.empty=true\n" +
"input.2.mouse.1.disabled=false\n" +
"input.2.mouse.2.empty=true\n" +
"input.2.mouse.2.disabled=false\n" +
"input.2.mouse.3.empty=true\n" +
"input.2.mouse.3.disabled=false\n" +
"input.2.mouse.4.empty=true\n" +
"input.2.mouse.4.disabled=false\n" +
"input.2.mouse.5.empty=true\n" +
"input.2.mouse.5.disabled=false\n" +
"input.2.mouse.6.empty=true\n" +
"input.2.mouse.6.disabled=false\n" +
"input.2.mouse.7.empty=true\n" +
"input.2.mouse.7.disabled=false\n" +
"input.2.keyboard.0.friendlyname=Default Keyboard\n" +
"input.2.keyboard.0.name=KEYBOARD0\n" +
"input.2.keyboard.0.empty=false\n" +
"input.2.keyboard.0.disabled=false\n" +
"input.2.keyboard.1.empty=true\n" +
"input.2.keyboard.1.disabled=false\n" +
"input.2.keyboard.2.empty=true\n" +
"input.2.keyboard.2.disabled=false\n" +
"input.2.keyboard.3.empty=true\n" +
"input.2.keyboard.3.disabled=false\n" +
"input.2.keyboard.4.empty=true\n" +
"input.2.keyboard.4.disabled=false\n" +
"input.2.keyboard.5.empty=true\n" +
"input.2.keyboard.5.disabled=false\n" +
"input.2.keyboard.6.empty=true\n" +
"input.2.keyboard.6.disabled=false\n" +
"input.2.keyboard.7.empty=true\n" +
"input.2.keyboard.7.disabled=false\n" +
"input.3.joystick.0.friendlyname=dPad as joystick\n" +
"input.3.joystick.0.name=JOY0\n" +
"input.3.joystick.0.empty=true\n" +
"input.3.joystick.0.disabled=false\n" +
"input.3.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n" +
"input.3.joystick.1.name=JOY1\n" +
"input.3.joystick.1.empty=true\n" +
"input.3.joystick.1.disabled=false\n" +
"input.3.joystick.2.empty=true\n" +
"input.3.joystick.2.disabled=false\n" +
"input.3.joystick.3.empty=true\n" +
"input.3.joystick.3.disabled=false\n" +
"input.3.joystick.4.empty=true\n" +
"input.3.joystick.4.disabled=false\n" +
"input.3.joystick.5.empty=true\n" +
"input.3.joystick.5.disabled=false\n" +
"input.3.joystick.6.empty=true\n" +
"input.3.joystick.6.disabled=false\n" +
"input.3.joystick.7.empty=true\n" +
"input.3.joystick.7.disabled=false\n" +
"input.3.mouse.0.friendlyname=Nubs as mouse\n" +
"input.3.mouse.0.name=MOUSE0\n" +
"input.3.mouse.0.empty=true\n" +
"input.3.mouse.0.disabled=false\n" +
"input.3.mouse.1.friendlyname=dPad as mouse\n" +
"input.3.mouse.1.name=MOUSE1\n" +
"input.3.mouse.1.empty=true\n" +
"input.3.mouse.1.disabled=false\n" +
"input.3.mouse.2.empty=true\n" +
"input.3.mouse.2.disabled=false\n" +
"input.3.mouse.3.empty=true\n" +
"input.3.mouse.3.disabled=false\n" +
"input.3.mouse.4.empty=true\n" +
"input.3.mouse.4.disabled=false\n" +
"input.3.mouse.5.empty=true\n" +
"input.3.mouse.5.disabled=false\n" +
"input.3.mouse.6.empty=true\n" +
"input.3.mouse.6.disabled=false\n" +
"input.3.mouse.7.empty=true\n" +
"input.3.mouse.7.disabled=false\n" +
"input.3.keyboard.0.friendlyname=Default Keyboard\n" +
"input.3.keyboard.0.name=KEYBOARD0\n" +
"input.3.keyboard.0.empty=false\n" +
"input.3.keyboard.0.disabled=false\n" +
"input.3.keyboard.1.empty=true\n" +
"input.3.keyboard.1.disabled=false\n" +
"input.3.keyboard.2.empty=true\n" +
"input.3.keyboard.2.disabled=false\n" +
"input.3.keyboard.3.empty=true\n" +
"input.3.keyboard.3.disabled=false\n" +
"input.3.keyboard.4.empty=true\n" +
"input.3.keyboard.4.disabled=false\n" +
"input.3.keyboard.5.empty=true\n" +
"input.3.keyboard.5.disabled=false\n" +
"input.3.keyboard.6.empty=true\n" +
"input.3.keyboard.6.disabled=false\n" +
"input.3.keyboard.7.empty=true\n" +
"input.3.keyboard.7.disabled=false\n" +
"input.4.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n" +
"input.4.joystick.1.name=JOY1\n" +
"input.4.joystick.1.custom=true\n" +
"input.4.mouse.0.friendlyname=Nubs as mouse\n" +
"input.4.mouse.0.name=MOUSE0\n" +
"input.4.mouse.0.custom=true\n" +
"input.4.keyboard.0.friendlyname=Default Keyboard\n" +
"input.4.keyboard.0.name=KEYBOARD0\n" +
"input.4.keyboard.0.custom=true\n");
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                writer.close();
            } catch (Exception e) {
            }
        }
    }
}
