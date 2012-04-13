package teaonly.projects.palmapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class OverlayView extends View {
    private Bitmap targetBMP = null;
    private Rect targetRect = null;

    public OverlayView(Context c, AttributeSet attr) {
        super(c, attr);        
    }

    public void DrawResult(Bitmap bmp) {
        if ( targetRect == null)
            targetRect = new Rect(0, 0, bmp.getWidth(), bmp.getHeight());
        targetBMP = bmp;
        postInvalidate(); 
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if ( targetBMP != null ) {            
            canvas.drawBitmap(targetBMP, null, targetRect, null);
        }
    }

}
