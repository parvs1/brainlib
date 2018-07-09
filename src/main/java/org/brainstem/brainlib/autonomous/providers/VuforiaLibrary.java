package org.brainstem.brainlib.autonomous.providers;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.RelicRecoveryVuMark;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;

/**
 * The class Vuforia library.
 */
public class VuforiaLibrary
{
	/**
	 * The Vuforia.
	 */
	VuforiaLocalizer vuforia;
	private LinearOpMode opMode;
	private VuforiaTrackables relicTrackables;
	private VuforiaTrackable relicTemplate;

	/**
	 * Instantiates a new Vuforia library.
	 *
	 * @param opMode the linear op mode
	 */
	public VuforiaLibrary(LinearOpMode opMode)
	{
		this.opMode = opMode;
	}

	/**
	 * Init.
	 */
	public void init()
	{
		int cameraMonitorViewId = opMode.hardwareMap
				.appContext.getResources().getIdentifier("cameraMonitorViewId",
						"id", opMode.hardwareMap.appContext.getPackageName());
		VuforiaLocalizer.Parameters parameters = new VuforiaLocalizer.Parameters(cameraMonitorViewId);

		parameters.vuforiaLicenseKey = "ATc1HXn/////AAAAGXcYUpavvEZdmzypOUD6enoXtBjUN+pRMlcmFkvjwxb4VBdp9LG4rehQhSXisCl5HUHuXBeLy6VO5i7wkjMPGZyh/7TCoj1//7cUgQ/CW4Z8jghN2qav8M2PLSmKJA+ujI8WfeLgrVlHXbyvtj3/NsLtkhmyFSdFaHT+Z6Sdi0ksWA4D8gaGXACBTE82hsST7cSlSsq6zuGvDrJx1ehxa45MpqMKUuXu20GOJdKreV1tQDbyuvkgWKplqIGOyoOHsrRcl9jwJPGv5nSp6y4LQrIaVKT/EltAPF7/uo12xaKdh72gM6KaTNkDZSPTecMMdqAglFfieqKI4JykjzKTNQr97+8VlraqtgJOoAFHqvJx";

		parameters.cameraDirection = VuforiaLocalizer.CameraDirection.BACK;
		this.vuforia = ClassFactory.createVuforiaLocalizer(parameters);

		relicTrackables = this.vuforia.loadTrackablesFromAsset("RelicVuMark");
		relicTemplate = relicTrackables.get(0);
		relicTemplate.setName("relicVuMarkTemplate");
	}

	public void activateTracking()
	{
		relicTrackables.activate();
	}

	/**
	 * Deactivate tracking.
	 */
	public void deactivateTracking()
	{
		relicTrackables.deactivate();
	}

	/**
	 * Gets vu mark.
	 *
	 * @return the vu mark
	 */
	public RelicRecoveryVuMark getVuMark()
	{
		return RelicRecoveryVuMark.from(relicTemplate);
	}
}
