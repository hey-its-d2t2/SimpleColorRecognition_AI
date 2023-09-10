import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.highgui.HighGui;

public class TrackbarExample {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        Mat imgHSV = new Mat(250, 500, CvType.CV_8UC3);
        Scalar hsvColor = new Scalar(0, 255, 255);
        imgHSV.setTo(hsvColor);

        HighGui.namedWindow("frame");

        HighGui.createTrackbar("H", "frame", 0, 179, new TrackbarCallback());
        HighGui.createTrackbar("S", "frame", 255, 255, new TrackbarCallback());
        HighGui.createTrackbar("V", "frame", 255, 255, new TrackbarCallback());

        while (true) {
            int h = HighGui.getTrackbarPos("H", "frame");
            int s = HighGui.getTrackbarPos("S", "frame");
            int v = HighGui.getTrackbarPos("V", "frame");

            hsvColor.set(new double[]{h, s, v});
            Imgproc.cvtColor(imgHSV, imgBGR, Imgproc.COLOR_HSV2BGR);

            HighGui.imshow("frame", imgBGR);

            if (HighGui.waitKey(1) == 27) {
                break;
            }
        }

        HighGui.destroyAllWindows();
    }

    private static class TrackbarCallback implements HighGui.CvTrackbarCallback {
        @Override
        public void onChange(int pos) {
            // Do nothing
        }
    }
}
