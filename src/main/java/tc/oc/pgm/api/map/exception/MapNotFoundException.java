package tc.oc.pgm.api.map.exception;

import tc.oc.pgm.api.map.MapInfo;
import tc.oc.pgm.api.map.MapSource;

import javax.annotation.Nullable;

/** Thrown when a {@link MapSource} cannot find a map. */
public class MapNotFoundException extends RuntimeException {

  private final @Nullable MapInfo info;

  public MapNotFoundException(MapInfo info, String message, Throwable cause) {
    super(
        info == null ? message : message == null ? info.getId() : info.getId() + ": " + message,
        cause);
    this.info = info;
  }

  public @Nullable MapInfo getMap() {
    return info;
  }

  public MapNotFoundException(MapInfo info) {
    this(info, null, null);
  }

  public MapNotFoundException(String message) {
    this(null, message);
  }

  public MapNotFoundException(Throwable cause) {
    this(cause.getMessage(), cause);
  }

  public MapNotFoundException(MapInfo info, String message) {
    this(info, message, null);
  }

  public MapNotFoundException(String message, Throwable cause) {
    this(null, message, cause);
  }
}