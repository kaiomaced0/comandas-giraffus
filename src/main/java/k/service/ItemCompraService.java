package k.service;

import java.util.List;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import k.dto.ItemCompraDTO;
import k.dto.ItemCompraResponseDTO;
import k.dto.ItemCompraUpdateDTO;

public interface ItemCompraService {

    // public List<ItemCompraResponseDTO> getAll();

    public Response insert(ItemCompraDTO itemCompraDTO);

    public Response update(ItemCompraUpdateDTO itemCompraUpdateDTO);

    public Response delete(@PathParam("id") Long id);

}
