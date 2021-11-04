/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amigacd32recalboxuae;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author djvat
 */
public class AmigaCd32Recalboxuae {

    static String rutacues = "n:/roms/amiga";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File folder = new File(rutacues);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
              
                if (escue(listOfFiles[i].getName())) {
                    System.out.println(listOfFiles[i].getName());
                    creauae(quitaextension(listOfFiles[i].getAbsolutePath()),listOfFiles[i].getName());
                
                }
            } else if (listOfFiles[i].isDirectory()) {

            }
        }
        System.out.println("Hecho.");
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

    private static void creauae(String cue, String nombre) {
        BufferedWriter writer = null;
        try {

            File logFile = new File(cue + ".uae");
            System.out.println(cue + ".uae");
            writer = new BufferedWriter(new FileWriter(logFile));

            writer.write("config_description=UAE default configuration\n");
            writer.write("config_hardware=true\n");
            writer.write("config_host=true\n");
            writer.write("config_version=2.8.1\n");
            writer.write("pandora.blitter_in_partial_mode=0\n");
            writer.write("pandora.joy_conf=0\n");
            writer.write("pandora.joy_port=0\n");
            writer.write("pandora.stylus_offset=0\n");
            writer.write("pandora.custom_dpad=1\n");
            writer.write("pandora.button1=2\n");
            writer.write("pandora.button2=1\n");
            writer.write("pandora.autofire_button=3\n");
            writer.write("pandora.jump=-1\n");
            writer.write("use_debugger=false\n");
            writer.write("floppy0sound=0\n");
            writer.write("floppy1sound=0\n");
            writer.write("floppy2sound=0\n");
            writer.write("floppy3sound=0\n");
            writer.write("floppy_volume=0\n");
            writer.write("scsi=false\n");
            writer.write("sound_volume=0\n");
            writer.write("sound_auto=yes\n");
            writer.write("gfx_refreshrate=0\n");
            writer.write("gfx_vsync=true\n");
            writer.write("gfx_center_horizontal=none\n");
            writer.write("gfx_center_vertical=none\n");
            writer.write("a1000ram=false\n");
            writer.write("rtg_nocustom=true\n");
            writer.write("kickstart_rom_file_id=C4F0F55F,KS ROM v1.3 (A500,A1000,A2000)\n");
            writer.write("pandora.rom_path=/recalbox/share_init/emulators/amiga/kickstarts/\n");
            writer.write("pandora.floppy_path=/recalbox/share/roms/amiga/\n");
            writer.write("pandora.hardfile_path=/recalbox/share/roms/amiga/\n");
            writer.write("pandora.cd_path=/recalbox/share/roms/amiga/\n");
            writer.write("; host-specific\n");
            writer.write("pandora.cpu_speed=600\n");
            writer.write("pandora.hide_idle_led=0\n");
            writer.write("pandora.tap_delay=10\n");
            writer.write("pandora.custom_controls=0\n");
            writer.write("pandora.custom_up=0\n");
            writer.write("pandora.custom_down=0\n");
            writer.write("pandora.custom_left=0\n");
            writer.write("pandora.custom_right=0\n");
            writer.write("pandora.custom_a=0\n");
            writer.write("pandora.custom_b=0\n");
            writer.write("pandora.custom_x=0\n");
            writer.write("pandora.custom_y=0\n");
            writer.write("pandora.custom_l=0\n");
            writer.write("pandora.custom_r=0\n");
            writer.write("pandora.move_x=0\n");
            writer.write("pandora.move_y=0\n");
            writer.write("; common\n");
            writer.write("use_gui=no\n");
            writer.write("kickstart_rom_file=/recalbox/share/bios/KS31_CD32.rom\n");
            writer.write("kickstart_ext_rom_file=/recalbox/share/bios/EXT_CD32.rom\n");
            writer.write("cd_speed=100\n");
            writer.write("cd32cd=true\n"
                    + "cd32c2p=true\n"
                    + "cd32nvram=true\n"
                    + "cdimage0=$(FILE_PATH)/" + nombre + ",image\n");
            writer.write("flash_file=\n");
            writer.write("floppy0=\n");
            writer.write("floppy1=\n");
            writer.write("floppy1type=-1\n");
            writer.write("floppy2=\n");
            writer.write("floppy3=\n");
            writer.write("nr_floppies=1\n");
            writer.write("floppy_speed=100\n");
            writer.write("sound_output=exact\n");
            writer.write("sound_channels=stereo\n");
            writer.write("sound_stereo_separation=7\n");
            writer.write("sound_stereo_mixing_delay=0\n");
            writer.write("sound_frequency=44100\n");
            writer.write("sound_interpol=none\n");
            writer.write("sound_filter=off\n");
            writer.write("sound_filter_type=standard\n");
            writer.write("sound_volume_cd=20\n");
            writer.write("cachesize=0\n");
            writer.write("joyport0=mouse\n");
            writer.write("joyport0autofire=none\n");
            writer.write("joyportfriendlyname0=Nubs as mouse\n");
            writer.write("joyportname0=MOUSE0\n");
            writer.write("joyport1=joy1\n");
            writer.write("joyport1autofire=none\n");
            writer.write("joyport1mode=cd32joy\n");
            writer.write("joyportfriendlyname1=USB,2-axis 8-button gamepad  \n");
            writer.write("joyportname1=JOY1\n");
            writer.write("joyport1_amiberry_custom_none_north=Joy2 Up\n" +
            "joyport1_amiberry_custom_none_east=Joy2 CD32 Green\n" +
            "joyport1_amiberry_custom_none_south=Joy2 CD32 Red\n" +
            "joyport1_amiberry_custom_none_west=Joy2 CD32 Yellow\n");
            writer.write("bsdsocket_emu=false\n");
            writer.write("synchronize_clock=true\n");
            writer.write("key_for_menu=293\n");
            writer.write("key_for_quit=0\n");
            writer.write("button_for_menu=-1\n");
            writer.write("button_for_quit=8\n");
            writer.write("gfx_framerate=0\n");
            writer.write("gfx_width=704\n");
            writer.write("gfx_height=280\n");
            writer.write("gfx_width_windowed=704\n");
            writer.write("gfx_height_windowed=280\n");
            writer.write("gfx_width_fullscreen=704\n");
            writer.write("gfx_height_fullscreen=280\n");
            writer.write("gfx_lores=true\n");
            writer.write("gfx_resolution=lores\n");
            writer.write("gfx_correct_aspect=0\n");
            writer.write("gfx_fullscreen_ratio=100\n");
            writer.write("kbd_led_num=-1\n");
            writer.write("kbd_led_scr=-1\n");
            writer.write("kbd_led_cap=-1\n");
            writer.write("immediate_blits=false\n");
            writer.write("waiting_blits=automatic\n");
            writer.write("fast_copper=false\n");
            writer.write("ntsc=false\n");
            writer.write("chipset=aga\n");
            writer.write("chipset_refreshrate=0.000000\n");
            writer.write("collision_level=playfields\n");
            writer.write("fastmem_size=8\n");
            writer.write("z3mem_size=0\n");
            writer.write("z3mem_start=0x1000000\n");
            writer.write("bogomem_size=0\n");
            writer.write("gfxcard_size=0\n");
            writer.write("gfxcard_type=ZorroIII\n");
            writer.write("chipmem_size=4\n");
            writer.write("cpu_speed=max\n");
            writer.write("cpu_type=68ec020\n");
            writer.write("cpu_model=68020\n");
            writer.write("cpu_compatible=false\n");
            writer.write("cpu_24bit_addressing=true\n");
            writer.write("rtg_modes=0x502\n");

            writer.write("input.config=0\n");
            writer.write("input.joymouse_speed_analog=2\n");
            writer.write("input.joymouse_speed_digital=10\n");
            writer.write("input.joymouse_deadzone=33\n");
            writer.write("input.joystick_deadzone=33\n");
            writer.write("input.analog_joystick_multiplier=15\n");
            writer.write("input.analog_joystick_offset=-1\n");
            writer.write("input.mouse_speed=25\n");
            writer.write("input.autofire_speed=0\n");
            writer.write("input.1.joystick.0.friendlyname=dPad as joystick\n");
            writer.write("input.1.joystick.0.name=JOY0\n");
            writer.write("input.1.joystick.0.empty=true\n");
            writer.write("input.1.joystick.0.disabled=false\n");
            writer.write("input.1.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n");
            writer.write("input.1.joystick.1.name=JOY1\n");
            writer.write("input.1.joystick.1.empty=true\n");
            writer.write("input.1.joystick.1.disabled=false\n");
            writer.write("input.1.joystick.2.empty=true\n");
            writer.write("input.1.joystick.2.disabled=false\n");
            writer.write("input.1.joystick.3.empty=true\n");
            writer.write("input.1.joystick.3.disabled=false\n");
            writer.write("input.1.joystick.4.empty=true\n");
            writer.write("input.1.joystick.4.disabled=false\n");
            writer.write("input.1.joystick.5.empty=true\n");
            writer.write("input.1.joystick.5.disabled=false\n");
            writer.write("input.1.joystick.6.empty=true\n");
            writer.write("input.1.joystick.6.disabled=false\n");
            writer.write("input.1.joystick.7.empty=true\n");
            writer.write("input.1.joystick.7.disabled=false\n");
            writer.write("input.1.mouse.0.friendlyname=Nubs as mouse\n");
            writer.write("input.1.mouse.0.name=MOUSE0\n");
            writer.write("input.1.mouse.0.empty=true\n");
            writer.write("input.1.mouse.0.disabled=false\n");
            writer.write("input.1.mouse.1.friendlyname=dPad as mouse\n");
            writer.write("input.1.mouse.1.name=MOUSE1\n");
            writer.write("input.1.mouse.1.empty=true\n");
            writer.write("input.1.mouse.1.disabled=false\n");
            writer.write("input.1.mouse.2.empty=true\n");
            writer.write("input.1.mouse.2.disabled=false\n");
            writer.write("input.1.mouse.3.empty=true\n");
            writer.write("input.1.mouse.3.disabled=false\n");
            writer.write("input.1.mouse.4.empty=true\n");
            writer.write("input.1.mouse.4.disabled=false\n");
            writer.write("input.1.mouse.5.empty=true\n");
            writer.write("input.1.mouse.5.disabled=false\n");
            writer.write("input.1.mouse.6.empty=true\n");
            writer.write("input.1.mouse.6.disabled=false\n");
            writer.write("input.1.mouse.7.empty=true\n");
            writer.write("input.1.mouse.7.disabled=false\n");
            writer.write("input.1.keyboard.0.friendlyname=Default Keyboard\n");
            writer.write("input.1.keyboard.0.name=KEYBOARD0\n");
            writer.write("input.1.keyboard.0.empty=false\n");
            writer.write("input.1.keyboard.0.disabled=false\n");
            writer.write("input.1.keyboard.1.empty=true\n");
            writer.write("input.1.keyboard.1.disabled=false\n");
            writer.write("input.1.keyboard.2.empty=true\n");
            writer.write("input.1.keyboard.2.disabled=false\n");
            writer.write("input.1.keyboard.3.empty=true\n");
            writer.write("input.1.keyboard.3.disabled=false\n");
            writer.write("input.1.keyboard.4.empty=true\n");
            writer.write("input.1.keyboard.4.disabled=false\n");
            writer.write("input.1.keyboard.5.empty=true\n");
            writer.write("input.1.keyboard.5.disabled=false\n");
            writer.write("input.1.keyboard.6.empty=true\n");
            writer.write("input.1.keyboard.6.disabled=false\n");
            writer.write("input.1.keyboard.7.empty=true\n");
            writer.write("input.1.keyboard.7.disabled=false\n");
            writer.write("input.2.joystick.0.friendlyname=dPad as joystick\n");
            writer.write("input.2.joystick.0.name=JOY0\n");
            writer.write("input.2.joystick.0.empty=true\n");
            writer.write("input.2.joystick.0.disabled=false\n");
            writer.write("input.2.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n");
            writer.write("input.2.joystick.1.name=JOY1\n");
            writer.write("input.2.joystick.1.empty=true\n");
            writer.write("input.2.joystick.1.disabled=false\n");
            writer.write("input.2.joystick.2.empty=true\n");
            writer.write("input.2.joystick.2.disabled=false\n");
            writer.write("input.2.joystick.3.empty=true\n");
            writer.write("input.2.joystick.3.disabled=false\n");
            writer.write("input.2.joystick.4.empty=true\n");
            writer.write("input.2.joystick.4.disabled=false\n");
            writer.write("input.2.joystick.5.empty=true\n");
            writer.write("input.2.joystick.5.disabled=false\n");
            writer.write("input.2.joystick.6.empty=true\n");
            writer.write("input.2.joystick.6.disabled=false\n");
            writer.write("input.2.joystick.7.empty=true\n");
            writer.write("input.2.joystick.7.disabled=false\n");
            writer.write("input.2.mouse.0.friendlyname=Nubs as mouse\n");
            writer.write("input.2.mouse.0.name=MOUSE0\n");
            writer.write("input.2.mouse.0.empty=true\n");
            writer.write("input.2.mouse.0.disabled=false\n");
            writer.write("input.2.mouse.1.friendlyname=dPad as mouse\n");
            writer.write("input.2.mouse.1.name=MOUSE1\n");
            writer.write("input.2.mouse.1.empty=true\n");
            writer.write("input.2.mouse.1.disabled=false\n");
            writer.write("input.2.mouse.2.empty=true\n");
            writer.write("input.2.mouse.2.disabled=false\n");
            writer.write("input.2.mouse.3.empty=true\n");
            writer.write("input.2.mouse.3.disabled=false\n");
            writer.write("input.2.mouse.4.empty=true\n");
            writer.write("input.2.mouse.4.disabled=false\n");
            writer.write("input.2.mouse.5.empty=true\n");
            writer.write("input.2.mouse.5.disabled=false\n");
            writer.write("input.2.mouse.6.empty=true\n");
            writer.write("input.2.mouse.6.disabled=false\n");
            writer.write("input.2.mouse.7.empty=true\n");
            writer.write("input.2.mouse.7.disabled=false\n");
            writer.write("input.2.keyboard.0.friendlyname=Default Keyboard\n");
            writer.write("input.2.keyboard.0.name=KEYBOARD0\n");
            writer.write("input.2.keyboard.0.empty=false\n");
            writer.write("input.2.keyboard.0.disabled=false\n");
            writer.write("input.2.keyboard.1.empty=true\n");
            writer.write("input.2.keyboard.1.disabled=false\n");
            writer.write("input.2.keyboard.2.empty=true\n");
            writer.write("input.2.keyboard.2.disabled=false\n");
            writer.write("input.2.keyboard.3.empty=true\n");
            writer.write("input.2.keyboard.3.disabled=false\n");
            writer.write("input.2.keyboard.4.empty=true\n");
            writer.write("input.2.keyboard.4.disabled=false\n");
            writer.write("input.2.keyboard.5.empty=true\n");
            writer.write("input.2.keyboard.5.disabled=false\n");
            writer.write("input.2.keyboard.6.empty=true\n");
            writer.write("input.2.keyboard.6.disabled=false\n");
            writer.write("input.2.keyboard.7.empty=true\n");
            writer.write("input.2.keyboard.7.disabled=false\n");
            writer.write("input.3.joystick.0.friendlyname=dPad as joystick\n");
            writer.write("input.3.joystick.0.name=JOY0\n");
            writer.write("input.3.joystick.0.empty=true\n");
            writer.write("input.3.joystick.0.disabled=false\n");
            writer.write("input.3.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n");
            writer.write("input.3.joystick.1.name=JOY1\n");
            writer.write("input.3.joystick.1.empty=true\n");
            writer.write("input.3.joystick.1.disabled=false\n");
            writer.write("input.3.joystick.2.empty=true\n");
            writer.write("input.3.joystick.2.disabled=false\n");
            writer.write("input.3.joystick.3.empty=true\n");
            writer.write("input.3.joystick.3.disabled=false\n");
            writer.write("input.3.joystick.4.empty=true\n");
            writer.write("input.3.joystick.4.disabled=false\n");
            writer.write("input.3.joystick.5.empty=true\n");
            writer.write("input.3.joystick.5.disabled=false\n");
            writer.write("input.3.joystick.6.empty=true\n");
            writer.write("input.3.joystick.6.disabled=false\n");
            writer.write("input.3.joystick.7.empty=true\n");
            writer.write("input.3.joystick.7.disabled=false\n");
            writer.write("input.3.mouse.0.friendlyname=Nubs as mouse\n");
            writer.write("input.3.mouse.0.name=MOUSE0\n");
            writer.write("input.3.mouse.0.empty=true\n");
            writer.write("input.3.mouse.0.disabled=false\n");
            writer.write("input.3.mouse.1.friendlyname=dPad as mouse\n");
            writer.write("input.3.mouse.1.name=MOUSE1\n");
            writer.write("input.3.mouse.1.empty=true\n");
            writer.write("input.3.mouse.1.disabled=false\n");
            writer.write("input.3.mouse.2.empty=true\n");
            writer.write("input.3.mouse.2.disabled=false\n");
            writer.write("input.3.mouse.3.empty=true\n");
            writer.write("input.3.mouse.3.disabled=false\n");
            writer.write("input.3.mouse.4.empty=true\n");
            writer.write("input.3.mouse.4.disabled=false\n");
            writer.write("input.3.mouse.5.empty=true\n");
            writer.write("input.3.mouse.5.disabled=false\n");
            writer.write("input.3.mouse.6.empty=true\n");
            writer.write("input.3.mouse.6.disabled=false\n");
            writer.write("input.3.mouse.7.empty=true\n");
            writer.write("input.3.mouse.7.disabled=false\n");
            writer.write("input.3.keyboard.0.friendlyname=Default Keyboard\n");
            writer.write("input.3.keyboard.0.name=KEYBOARD0\n");
            writer.write("input.3.keyboard.0.empty=false\n");
            writer.write("input.3.keyboard.0.disabled=false\n");
            writer.write("input.3.keyboard.1.empty=true\n");
            writer.write("input.3.keyboard.1.disabled=false\n");
            writer.write("input.3.keyboard.2.empty=true\n");
            writer.write("input.3.keyboard.2.disabled=false\n");
            writer.write("input.3.keyboard.3.empty=true\n");
            writer.write("input.3.keyboard.3.disabled=false\n");
            writer.write("input.3.keyboard.4.empty=true\n");
            writer.write("input.3.keyboard.4.disabled=false\n");
            writer.write("input.3.keyboard.5.empty=true\n");
            writer.write("input.3.keyboard.5.disabled=false\n");
            writer.write("input.3.keyboard.6.empty=true\n");
            writer.write("input.3.keyboard.6.disabled=false\n");
            writer.write("input.3.keyboard.7.empty=true\n");
            writer.write("input.3.keyboard.7.disabled=false\n");
            writer.write("input.4.joystick.1.friendlyname=USB,2-axis 8-button gamepad\n");
            writer.write("input.4.joystick.1.name=JOY1\n");
            writer.write("input.4.joystick.1.custom=true\n");
            writer.write("input.4.mouse.0.friendlyname=Nubs as mouse\n");
            writer.write("input.4.mouse.0.name=MOUSE0\n");
            writer.write("input.4.mouse.0.custom=true\n");
            writer.write("input.4.keyboard.0.friendlyname=Default Keyboard\n");
            writer.write("input.4.keyboard.0.name=KEYBOARD0\n");
            writer.write("input.4.keyboard.0.custom=true\n");

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
