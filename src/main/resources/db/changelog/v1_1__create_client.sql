DROP TABLE IF EXISTS client;

CREATE TABLE client (
    id          BIGINT PRIMARY KEY,
    name        VARCHAR(256) NOT NULL,
    agreement   BOOLEAN DEFAULT FALSE
);

COMMENT ON TABLE client IS 'Client data.';
COMMENT ON COLUMN client.name IS 'Name of the client.';
COMMENT ON COLUMN client.agreement IS 'Whether the client agreed to the terms.';


DROP TABLE IF EXISTS client_sector;

CREATE TABLE client_sector (
    id          BIGINT PRIMARY KEY,
    client_id   BIGINT NOT NULL,
    sector_id   BIGINT NOT NULL
);

COMMENT ON TABLE client_sector IS 'The sectors of the client.';
COMMENT ON COLUMN client_sector.client_id IS 'Reference to the client.';
COMMENT ON COLUMN client_sector.sector_id IS 'Reference to the sector.';
