DROP TABLE IF EXISTS sector;

CREATE TABLE sector (
    id          BIGINT PRIMARY KEY,
    name        VARCHAR(150) NOT NULL,
    parent      BIGINT
);

COMMENT ON TABLE sector IS 'The sectors with sub-sectors.';
COMMENT ON COLUMN sector.name IS 'Name of the sector.';
COMMENT ON COLUMN sector.parent IS 'Reference to the parent sector if the current one is a sub-sector, null otherwise.';
